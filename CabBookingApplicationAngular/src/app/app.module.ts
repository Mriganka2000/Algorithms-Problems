import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminComponent } from './admin/admin.component';
import { CustomerComponent } from './customer/customer.component';
import { DriverComponent } from './driver/driver.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { NgbAlertConfig, NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ProfileComponent } from './customer/profile/profile.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { UpdateComponent } from './customer/update/update.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { CustomerSignUpComponent } from './signup/customer-sign-up/customer-sign-up.component';
import { DriverSignUpComponent } from './signup/driver-sign-up/driver-sign-up.component';
import { DriverLogInComponent } from './login/driver-log-in/driver-log-in.component';
import { CustomerLogInComponent } from './login/customer-log-in/customer-log-in.component';
import { AdminLogInComponent } from './login/admin-log-in/admin-log-in.component';
import { AdminProfileComponent } from './admin/admin-profile/admin-profile.component';
import { AdminUpdateComponent } from './admin/admin-update/admin-update.component';
import { AllAdminsSearchComponent } from './admin/all-admins-search/all-admins-search.component';
import { AllAdminsUpdateComponent } from './admin/all-admins-update/all-admins-update.component';
import { AllCustomerUpdateComponent } from './admin/all-customer-update/all-customer-update.component';
import { AllCustomersSearchComponent } from './admin/all-customers-search/all-customers-search.component';
import { AllDriversSearchComponent } from './admin/all-drivers-search/all-drivers-search.component';
import { AllDriversUpdateComponent } from './admin/all-drivers-update/all-drivers-update.component';

import { LocationPipe } from './Pipes/location.pipe';
import { CalculateBillPipe } from './Pipes/calculate-bill.pipe';
import { BookingComponent } from './customer/booking/booking.component';
import { HistoryComponent } from './customer/history/history.component';
import { WalletComponent } from './customer/wallet/wallet.component';
import { TripComponent } from './customer/trip/trip.component';
import { DriverProfileComponent } from './driver/driver-profile/driver-profile.component';
import { DriverUpdateComponent } from './driver/driver-update/driver-update.component';
import { CustomerFilterPipe } from './Pipes/customer-filter.pipe';
import { AdminFilterPipe } from './Pipes/admin-filter.pipe';
import { DriverFilterPipe } from './Pipes/driver-filter.pipe';


@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    CustomerComponent,
    DriverComponent,
    LoginComponent,
    SignupComponent,
    HomeComponent,
    AboutComponent,
    ProfileComponent,
    UpdateComponent,
    PageNotFoundComponent,
    CustomerSignUpComponent,
    DriverSignUpComponent,
    DriverLogInComponent,
    CustomerLogInComponent,
    AdminLogInComponent,
    AdminProfileComponent,
    AdminUpdateComponent,
    AllAdminsSearchComponent,
    AllAdminsUpdateComponent,
    AllCustomerUpdateComponent,
    AllCustomersSearchComponent,
    AllDriversSearchComponent,
    AllDriversUpdateComponent,
    LocationPipe,
    CalculateBillPipe,
    BookingComponent,
    HistoryComponent,
    WalletComponent,
    TripComponent,
    DriverProfileComponent,
    DriverUpdateComponent,
    CustomerFilterPipe,
    AdminFilterPipe,
    DriverFilterPipe,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule,



  ],
  providers: [NgbAlertConfig],
  bootstrap: [AppComponent]
})
export class AppModule { }
