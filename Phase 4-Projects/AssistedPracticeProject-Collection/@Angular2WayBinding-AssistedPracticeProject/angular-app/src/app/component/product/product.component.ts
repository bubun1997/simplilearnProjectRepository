import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Products } from 'src/Products';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  @Input() pro! : Products;
  @Output() deleteProduct : EventEmitter<Products> = new EventEmitter<Products>();

  constructor() { }

  ngOnInit(): void {
  }

  onClick(product:Products){

        this.deleteProduct.emit(product);
        console.log("triggered");
  }

}
