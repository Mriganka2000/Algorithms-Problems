import { IAdmin } from 'src/app/utils/Admin';
import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'adminFilter'
})
export class AdminFilterPipe implements PipeTransform {

  transform(admins: IAdmin[], searchFilter:string ): IAdmin[] {
    if (!admins || !searchFilter) {
      return admins;
    }
    else {
      return admins.filter(admins =>
        admins.username.toLocaleLowerCase().includes(searchFilter.toLocaleLowerCase()) ||
        admins.email.toLocaleLowerCase().toLocaleLowerCase().includes(searchFilter) ||
        admins.adminId.toString().toLocaleLowerCase().includes(searchFilter.toLocaleLowerCase()) ||
        admins.password.toLocaleLowerCase().includes(searchFilter.toLocaleLowerCase()) ||
        admins.mobileNumber.toLocaleLowerCase().includes(searchFilter.toLocaleLowerCase())
      );
    }
  }

}
