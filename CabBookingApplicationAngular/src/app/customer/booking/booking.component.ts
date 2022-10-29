import { CustomerService } from './../customer.service';
import { Component, OnInit } from '@angular/core';
import { NgbProgressbarConfig } from '@ng-bootstrap/ng-bootstrap';
import { interval } from 'rxjs';


@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {

  constructor(private _customerService: CustomerService, private config: NgbProgressbarConfig) {
    config.max = 10;
    config.striped = true;
    config.animated = true;
    config.type = 'warning';
    config.height = '20px';

  }


  driver!: Driver;
  customerId!: number;
  driverId!: number;
  from_location!: string;
  to_location!: string;
  bill!: number
  distance!: number
  progressValue: number = 0
  message: string = ''
  fromDateTime!: string
  toDateTime!: string
  trip!: Trip
  customer!: Customer

  ngOnInit(): void {
    this.customerId = this._customerService.getCustomerId()
    this.from_location = this._customerService.getFromLocation()
    this.to_location = this._customerService.getToLocation()
    this.bill = this._customerService.getBill()
    // console.log('Billl = '+this.bill)
    this.distance = this._customerService.getDistance()
    this.driverId = this._customerService.getDriverId()
    this.fromDateTime = new Date().toISOString()

    this._customerService.getCustomerDetails().subscribe(
      (data: Customer) => {
        this.customer = data
      }

    )
    this._customerService.getDriverDetailsById(this.driverId).subscribe(
      (data: Driver) => this.driver = data
    )
    if (this.customerId && this.driverId && this.from_location && this.to_location && this.bill) {
      this.startTimer(10)
    }
  }

  startTrip() {
    this.trip = new Trip(this.customer, this.bill, this.toDateTime, true, this.from_location, this.driver, this.distance, this.fromDateTime, this.to_location)
    console.log(this.trip)
    this._customerService.insertTrip(this.trip).subscribe(data => console.log(data))
  }

  showMessage: boolean = false

  progressbarValue = 0;
  curSec: number = 0;
  tripMesasge: string = 'Traveling'

  startTimer(seconds: number) {
    const time = seconds;
    const timer$ = interval(1000);

    const sub = timer$.subscribe((sec) => {
      this.progressbarValue = 1 + sec * 10 / seconds;
      this.curSec = sec;

      if (this.curSec === seconds) {
        sub.unsubscribe();
        this.tripMesasge = 'Completed !'
        this.showMessage = true
        this.toDateTime = new Date().toISOString()
        this.startTrip()
      }
    })

  }

}
class Customer {
  customerId: number = 0;
  email: string = '';
  mobileNumber: string = '';
  password: string = '';
  username: string = '';
}


class Driver {

  cab = {

    cabId: 0,
    carType: '',
    perKmRate: 0
  }
  driverId: number = 0;
  email: string = '';
  mobileNumber: string = '';
  password: string = '';
  username: string = '';
  licenseNo: string = '';
  rating: number = 0;

}

class Trip {
  bill !: number
  customer: Customer
  distanceInKm!: number;

  driver: Driver;
  fromDateTime: string;
  fromLocation: string;
  status: boolean;
  toDateTime: String;
  toLocation: string;

  constructor(customer: Customer, bill: number, toDateTime: string, status: boolean, fromLocation: string, driver: Driver, distanceInKm: number, fromDateTime: string, toLocation: string) {
    this.customer = customer
    this.driver = driver
    this.distanceInKm = distanceInKm
    this.fromDateTime = fromDateTime
    this.toLocation = toLocation
    this.fromLocation = fromLocation
    this.status = status
    this.toDateTime = toDateTime
    this.bill = bill
  }
}
