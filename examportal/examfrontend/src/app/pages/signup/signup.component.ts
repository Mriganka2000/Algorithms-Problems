import { Component, OnInit } from '@angular/core';
import { UserService } from "../../services/user.service";
import { MatSnackBar } from "@angular/material/snack-bar";

import Swal from 'sweetalert2';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  constructor(
    private userService: UserService,
    private _snack: MatSnackBar
  ) { }

  public user = {
    username: '',
    password: '',
    firstname: '',
    lastname: '',
    email: '',
    phone: ''
  };

  ngOnInit(): void {
  }

  formSubmit() {
    console.log(this.user);

    if (this.user.username == '' || this.user.username == null) {
      // alert('Username is required');
      this._snack.open('Username is required', 'ok', {
        horizontalPosition: 'left',
        verticalPosition: 'bottom'
      });
      return;
    }

    this.userService.addUser(this.user).subscribe(
      (data: any) => {
        console.log(data);
        // this._snack.open('Successfully added user', '', {
        //   duration: 3000,
        //   horizontalPosition: 'left',
        //   verticalPosition: 'bottom'
        // });
        Swal.fire('Success', 'User ' + data.username + ' is registered', 'success');
      },
      (error) => {
        console.log(error);
        this._snack.open('User adding failed', '', {
          duration: 3000,
          horizontalPosition: 'left',
          verticalPosition: 'bottom'
        });
      }
    );
  }

}
