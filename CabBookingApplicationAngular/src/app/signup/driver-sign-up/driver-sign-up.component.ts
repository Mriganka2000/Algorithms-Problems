import { SignupService } from './../signup.service';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-driver-sign-up',
  templateUrl: './driver-sign-up.component.html',
  styleUrls: ['./driver-sign-up.component.css']
})
export class DriverSignUpComponent implements OnInit {

  constructor(private fb: FormBuilder, private _signupService: SignupService) { }
/**
 *   driver: IDriver = {
    cab: {
      "cabId": 0,
      "carType": "",
      "perKmRate": 0
    },
    driverId: 0,
    email: '',
    mobileNumber: '',
    password: '',
    username: ''
  }
 */

  alertType!: string;
  signUpForm!: FormGroup;
  terms!: FormGroup;
  showAlert!: boolean;
  email!: FormControl;
  username!: FormControl;
  password!:FormControl;
  mobileNumber!:FormControl;
  ngOnInit(): void {
    this.createFormControls()
    this.signUpForm = this.fb.group({

      username: this.username,
      email: this.email,
      password: this.password,
      mobileNumber: this.mobileNumber

    });
    this.terms = this.fb.group(
      { checkMe: [false, Validators.requiredTrue] }
    )
  }

  createFormControls() {
    this.email = new FormControl('', [
      Validators.required,
      Validators.email
    ]);
    this.username = new FormControl('',
      [
        Validators.required,
        Validators.minLength(4),
        Validators.maxLength(10),
        Validators.pattern("^[a-zA-Z0-9]+$")]);
    this.password=new FormControl('',
    [
      Validators.required,
        Validators.minLength(4),
        Validators.maxLength(10),  
    ]);
    this.mobileNumber=new FormControl('',
    [
      Validators.required,
      Validators.maxLength(12),  
        Validators.pattern('^[0-9]*$')]);
 }
  signUp() {
    this._signupService.driverSignUp(this.signUpForm.value).subscribe(() => { this.alertType = 'success'; this.showAlert = true });
  }

}
