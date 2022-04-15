import { Component } from '@angular/core';
import { myproducts } from 'src/Products';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-app';

  productslist:{ productId:number , productName:string , productPrice:number}[] = myproducts;

  showProducts:boolean = false;
  
}
