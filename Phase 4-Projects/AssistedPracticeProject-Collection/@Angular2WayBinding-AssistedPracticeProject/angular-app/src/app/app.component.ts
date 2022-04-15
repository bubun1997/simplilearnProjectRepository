import { Component } from '@angular/core';
import { myProducts  } from 'src/ProductList';
import { Products } from 'src/Products';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

    myProducts: Products[] = myProducts;

    productDelete(product:Products){

      this.myProducts.splice(this.myProducts.indexOf(product),1);

    }
}
