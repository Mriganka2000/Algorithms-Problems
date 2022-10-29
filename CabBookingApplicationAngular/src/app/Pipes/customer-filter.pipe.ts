import { Pipe, PipeTransform } from '@angular/core';
import { ICustomer } from '../utils/Customer';

@Pipe({
  name: 'customerFilter'
})
export class CustomerFilterPipe implements PipeTransform {

  transform(customers: ICustomer[], searchFilter: string): ICustomer[] {

    if (!customers || !searchFilter) {
      return customers;
    }
    else {
      return customers.filter(customers =>
        customers.username.toLocaleLowerCase().includes(searchFilter.toLocaleLowerCase()) ||
        customers.email.toLocaleLowerCase().toLocaleLowerCase().includes(searchFilter) ||
        customers.customerId.toString().toLocaleLowerCase().includes(searchFilter.toLocaleLowerCase()) ||
        customers.password.toLocaleLowerCase().includes(searchFilter.toLocaleLowerCase()) ||
        customers.mobileNumber.toLocaleLowerCase().includes(searchFilter.toLocaleLowerCase())
      );
    }

  }
}
