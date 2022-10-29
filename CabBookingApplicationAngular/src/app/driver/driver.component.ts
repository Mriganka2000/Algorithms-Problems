import { LoginService } from './../login/login.service';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { DriverService } from './driver.service';

@Component({
  selector: 'app-driver',
  templateUrl: './driver.component.html',
  styleUrls: ['./driver.component.css']
})
export class DriverComponent implements OnInit {

  active = 'welcome';

  constructor(private actRouter: ActivatedRoute, private _driverService: DriverService,  private router:Router,private _loginService:LoginService,) { }
  public isCollapsed = false;
  ngOnInit(): void {
    this._driverService.setDriverId(this.actRouter.snapshot.params['driverId']);

  }

  logout(){
    this._driverService.driverLogOut()
    this._loginService.setAuthFlag(false)
    this.router.navigate(['home'])

  }
}
