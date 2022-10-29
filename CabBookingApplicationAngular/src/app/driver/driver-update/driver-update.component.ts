import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ICab } from 'src/app/utils/Cab';
import { IDriver } from '../Driver';

import { DriverService } from '../driver.service';

@Component({
  selector: 'app-driver-update',
  templateUrl: './driver-update.component.html',
  styleUrls: ['./driver-update.component.css']
})
export class DriverUpdateComponent implements OnInit {
  constructor(private _driverService: DriverService, private router: Router) { }

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

  ngOnInit(): void {
    this._driverService.getDriverDetails().subscribe((data: IDriver) => {
      this.driver = data;

    })
  }

  updateDriver() {
    this._driverService.updateDriver(this.driver).subscribe((data) => {
      this.driver = data;
      this.router.navigate(['driver', this._driverService.driverId, 'profile'])
    })
  }


}
