import { IDriver } from 'src/app/utils/Driver';
import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'driverFilter'
})
export class DriverFilterPipe implements PipeTransform {

  transform(drivers:IDriver[], searchFilter:string): IDriver[] {

    if (!drivers || !searchFilter) {
      return drivers;
    }
    else {
      return drivers.filter(drivers =>
        drivers.username.toLocaleLowerCase().includes(searchFilter.toLocaleLowerCase()) ||
        drivers.email.toLocaleLowerCase().toLocaleLowerCase().includes(searchFilter) ||
        drivers.driverId.toString().toLocaleLowerCase().includes(searchFilter.toLocaleLowerCase()) ||
        drivers.password.toLocaleLowerCase().includes(searchFilter.toLocaleLowerCase()) ||
        drivers.mobileNumber.toLocaleLowerCase().includes(searchFilter.toLocaleLowerCase())
      );
    }
  }

}
