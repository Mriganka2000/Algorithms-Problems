import { Observable, throwError } from 'rxjs';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { catchError } from 'rxjs/operators'
import { ICustomer } from '../utils/Customer';

/**
 * @author Praharshini and Sai Kishore
 * @class CustomerService
 * @description Contains CRUD operations of Customer Module and Trip Details
 */

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  customerId!: number;
  customer!: ICustomer;
  driverId!: number;
  distance!: number;
  bill!: number;
  from_location!: string
  to_location!: string



  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }


  /**
   *
   * @param httpClient
   */
  constructor(private httpClient: HttpClient) { }
  /**
   *
   * @param from_location
   */
  setFromLocation(from_location: string) {
    this.from_location = from_location
  }
  /**
   *
   * @returns from_location
   */
  getFromLocation(): string {
    return this.from_location
  }
  /**
   *
   * @param to_location
   */
  setToLocation(to_location: string) {
    this.to_location = to_location
  }
  /**
   *
   * @returns to_location
   */
  getToLocation(): string {
    return this.to_location
  }
  /**
   *
   * @param bill
   */
  setBill(bill: number) {
    this.bill = bill
  }

  /**
   *
   * @returns bill
   */
  getBill(): number {
    return this.bill
  }
  /**
   *
   * @param cutomerId
   */
  setCutomerId(cutomerId: number) {
    this.customerId = cutomerId;
  }
  getCustomerId(): number {
    return this.customerId
  }
  /**
   *
   * @param driverId
   */
  setDriverId(driverId: number) {
    this.driverId = driverId
  }
  /**
   *
   * @returns driverId
   */
  getDriverId(): number {
    return this.driverId
  }
  /**
   *
   * @param distance
   */
  setDistance(distance: number) {
    this.distance = distance
  }
  getDistance(): number {
    return this.distance
  }




  customer_url = 'http://localhost:8085/customer/';
  trip_url = 'http://localhost:8085/tripbooking/';
  location_url = 'assets/Location.json'
  drivers_url = 'http://localhost:8085/driver/'

  /**
   *
   * @returns  Observable<any>
   */
  getCustomerTrips(): Observable<any> {
    return this.httpClient.get<any>(this.trip_url + 'customerId/' + this.customerId).pipe(
      catchError(this.handleError)
    );
  }


  customerLogout() {
    this.customerId = 0
  }
  /**
   *
   * @returns any
   */
  getLocations() {
    return this.httpClient.get<any>(this.location_url)
  }

  /**
   *
   * @returns Observable<any>
   */
  getAllDrivers(): Observable<any> {
    return this.httpClient.get<any>(this.drivers_url)
  }
  /**
   *
   * @param driverId
   * @returns Driver
   */
  getDriverDetailsById(driverId: number) {
    return this.httpClient.get<Driver>(this.drivers_url + driverId).pipe(
      catchError(this.handleError)
    );
  }

  /** Trip */


  /**
   *
   * @param trip
   * @returns trip
   */
  insertTrip(trip: Trip) {
    console.log('===> ' + trip.bill)
    return this.httpClient.post(this.trip_url, trip).pipe(
      catchError(this.handleError)
    );

  }

  /**
   *
   * @returns Observable<ICustomer>
   */
  getCustomerDetails(): Observable<ICustomer> {
    return this.httpClient.get<ICustomer>(this.customer_url + this.customerId).pipe(
      catchError(this.handleError)
    );
  }
  /**
   *
   * @param cutomer
   * @returns Observable<ICustomer>
   */
  updateCustomer(cutomer: ICustomer): Observable<ICustomer> {
    return this.httpClient.post<ICustomer>(this.customer_url, cutomer, this.httpOptions).pipe(
      catchError(this.handleError)
    );
  }
  /**
   *
   * @param eResponse
   *
   */
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
class Customer {
  customerId: number = 0;
  email: string = '';
  mobileNumber: string = '';
  password: string = '';
  username: string = '';
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
  /**
   *
   * @param customer
   * @param toDateTime
   * @param status
   * @param fromLocation
   * @param driver
   * @param distanceInKm
   * @param fromDateTime
   * @param toLocation
   */
  constructor(customer: Customer, toDateTime: string, status: boolean, fromLocation: string, driver: Driver, distanceInKm: number, fromDateTime: string, toLocation: string) {
    this.customer = customer
    this.driver = driver
    this.distanceInKm = distanceInKm
    this.fromDateTime = fromDateTime
    this.toLocation = toLocation
    this.fromLocation = fromLocation
    this.status = status
    this.toDateTime = toDateTime
  }
}
