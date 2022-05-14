import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { AboutComponent } from './about/about.component';
import { AdminComponent } from './admin/admin.component';
import { CustomerComponent } from './customer/customer.component';
import { DriverComponent } from './driver/driver.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { SignupComponent } from './signup/signup.component';
import { AdminFilterPipe } from './Pipes/admin-filter.pipe';
import { CalculateBillPipe } from './Pipes/calculate-bill.pipe';

@NgModule({
  declarations: [
    AppComponent,
    AboutComponent,
    AdminComponent,
    CustomerComponent,
    DriverComponent,
    HomeComponent,
    LoginComponent,
    PageNotFoundComponent,
    SignupComponent,
    AdminFilterPipe,
    CalculateBillPipe
  ],
  imports: [
    BrowserModule,
    FontAwesomeModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
