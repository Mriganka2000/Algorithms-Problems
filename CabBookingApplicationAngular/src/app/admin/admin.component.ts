import { LoginService } from './../login/login.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { AdminService } from './admin.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  active = 'welcome';

  constructor(private actRouter: ActivatedRoute, private _adminService: AdminService, private _loginService: LoginService, private router: Router) { }
  public isCollapsed = false;
  ngOnInit(): void {
    this._adminService.setAdminId(this.actRouter.snapshot.params['adminId']);

  }

  logOut() {
    this._adminService.adminLogOut()
    this._loginService.setAuthFlag(false)
    this.router.navigate(['home'])
  }

}
