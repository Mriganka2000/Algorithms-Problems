import { ICab } from "./Cab";

export class IDriver{
  driverId: number=0;
  email: string='';
  mobileNumber: string='';
  password: string='';
  username: string='';
  licenseNo:string='';
  cab!:ICab;
  rating:number=0;
}
