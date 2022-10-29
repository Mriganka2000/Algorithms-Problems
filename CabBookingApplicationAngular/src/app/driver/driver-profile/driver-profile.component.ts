import { Component, OnInit } from '@angular/core';
import { IDriver } from '../Driver';

import { DriverService } from '../driver.service';

@Component({
  selector: 'app-driver-profile',
  templateUrl: './driver-profile.component.html',
  styleUrls: ['./driver-profile.component.css']
})
export class DriverProfileComponent implements OnInit {


  driver: IDriver = {
    driverId: 0,
    email: '',
    mobileNumber: '',
    password: '',
    username: '',
    licenseNo: '',
    cab: {
      cabId: 0,
      carType: '',
      perKmRate: 0
    },
    rating: 0
  }

  constructor(private _driverService: DriverService) { }

  ngOnInit(): void {

    this._driverService.getDriverDetails().subscribe((data: IDriver) => {
      this.driver = data;
    })
  }


}
