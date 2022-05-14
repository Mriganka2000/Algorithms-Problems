import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'calculateBill'
})
export class CalculateBillPipe implements PipeTransform {

  transform(value: unknown, ...args: unknown[]): unknown {
    return null;
  }

}
