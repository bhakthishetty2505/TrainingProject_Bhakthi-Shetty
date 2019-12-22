import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(product: any, search: string): any {
    if (!product) {
      return null;
    }
    if (!search) {
      return product;
    }
    return product.filter(function(item) {
      return JSON.stringify(item).toLowerCase().includes(search.toLowerCase());
    });
  }

}
