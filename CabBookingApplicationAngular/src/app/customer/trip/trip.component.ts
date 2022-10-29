import { Router } from '@angular/router';
import { CustomerService } from './../customer.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-trip',
  templateUrl: './trip.component.html',
  styleUrls: ['./trip.component.css']
})
export class TripComponent implements OnInit {

  constructor(private _customerService: CustomerService, private router:Router) { }
  locationId: number = 0;



  to_locationId:number=0
  to_location!:string;

  distance: number = 0;
  locationsArray: locations[] = []
  drivers: Driver[] = []


  ngOnInit(): void {
    this.getLocations()
  }
  getLocations() {
    this._customerService.getLocations().subscribe((data: locations[]) => this.locationsArray = data)
  }
  search(){
   this.to_location= this.locationsArray.filter(loc=>loc.id==this.locationId)[0].possibleROutes.filter(data=>data.LId==this.to_locationId)[0].to_Location
   this.distance= this.locationsArray.filter(loc=>loc.id==this.locationId)[0].possibleROutes.filter(data=>data.LId==this.to_locationId)[0].Distance
  }


  getDrivers() {
    this._customerService.getAllDrivers().subscribe(
      (data: Driver[]) => this.drivers = data
    )
  }
  bookTrip(driverId:number,bill:number){
    this._customerService.setDriverId(driverId)
    this._customerService.setDistance(this.distance)
    this._customerService.setBill(bill)
    this._customerService.setFromLocation(this.locationsArray.filter(location=>location.id==this.locationId)[0].from_Location)
    this._customerService.setToLocation(this.to_location)

    this.router.navigate(['customer',this._customerService.getCustomerId(),'book']);

  }
}

class locations {
  "id": number;
  "from_Location": string;
  "possibleROutes": location[]
}
class location {
  "LId": number;
  "to_Location": string;
  "Distance": number
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
