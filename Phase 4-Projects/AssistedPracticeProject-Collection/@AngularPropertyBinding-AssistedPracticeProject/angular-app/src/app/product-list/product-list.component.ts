import { Component, OnInit } from '@angular/core';
import { productlists } from '../ProductList';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

   productlists:{ productId : number , productName : string , productPrice : number }[] = productlists;
  
  constructor() { }

  ngOnInit(): void {

    
         
    
  }

}
