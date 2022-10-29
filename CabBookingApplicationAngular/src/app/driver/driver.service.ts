import { HttpClient, HttpErrorResponse, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { IDriver } from './Driver';


@Injectable({
  providedIn: 'root'
})
export class DriverService {

  driverId!: number;

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
}
  constructor(private httpClient: HttpClient) { }

  public setDriverId(driverId: number) {
    this.driverId = driverId;
  }
  public getDriverId(): number {
    return this.driverId;
  }

  private driver_base_url = 'http://localhost:8085/driver/';
  private trips_url='http://localhost:8085/tripbooking/allTrips/'

/**
 *
 * @returns
 */
  getDriverDetails() {
    return this.httpClient.get<IDriver>(this.driver_base_url + this.driverId).pipe(
      catchError(this.handleError)
    );
  }
/**
 *
 * @param driverId
 * @returns
 */
  getDriverDetailsById(driverId: number) {
    return this.httpClient.get<IDriver>(this.driver_base_url + driverId).pipe(
      catchError(this.handleError)
    );
  }
/**
 *
 * @param driver
 * @returns
 */

driverLogOut(){
  this.driverId=0
}

  updateDriver(driver: IDriver): Observable<IDriver> {
    return this.httpClient.post<IDriver>(this.driver_base_url, driver, this.httpOptions).pipe(
      catchError(this.handleError)
    );
  }
  /**
   *
   * @param driverId
   * @returns
   */
  deleteDriverByDriverId(driverId: number): Observable<IDriver[]> {
    return this.httpClient.delete<IDriver[]>(this.driver_base_url + driverId).pipe(
      catchError(this.handleError)
    );
  }
/**
 *
 * @returns
 */
  getAllDrivers(): Observable<IDriver[]> {
    return this.httpClient.get<IDriver[]>(this.driver_base_url).pipe(
      catchError(this.handleError)
    );
  }

  viewAllTrips():Observable<Trip[]>{
    return this.httpClient.get<Trip[]>(this.trips_url).pipe(
      catchError(this.handleError)
    );
  }


  handleError(eResponse: HttpErrorResponse) {
    if (eResponse.error instanceof ErrorEvent) {
      console.log("Client Side Error =" + eResponse.error.message);
      console.log("Status Code=" + eResponse.status);
    }
    else {
      console.log("Server Side Error =" + eResponse.error.message);
      console.log("Status Code=" + eResponse.status);
    }
    return throwError(eResponse.error.message);
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
