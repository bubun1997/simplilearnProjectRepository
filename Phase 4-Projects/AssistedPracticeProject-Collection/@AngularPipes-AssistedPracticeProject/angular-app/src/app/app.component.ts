import { Component } from '@angular/core';
@Component({
    selector: 'app-root',
    template: `
    <div style="text-align:center">
      <h3> Currency Pipe</h3>
      <p>{{ itemPrice | currency:'USD':true }}</p>      
      <p>{{ itemPrice | currency:'EUR':true}}</p>
      <p>{{ itemPrice | currency:'INR' }}</p>
    </div>
    `
})
export class AppComponent {
  itemPrice: number = 5.50;
  title:string="";
}
