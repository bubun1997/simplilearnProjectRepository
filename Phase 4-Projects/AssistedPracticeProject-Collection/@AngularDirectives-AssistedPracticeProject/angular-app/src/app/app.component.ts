import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {


  showView!:boolean;

  itemsList:{ name:string , price:number }[] =[
      
    {
      "name" : 'Laptop',
      "price" : 40000.00
    },
    {
      "name" : 'Tablet',
      "price" : 35200.00
    },
    {
      "name" : 'Macbook',
      "price" : 42000.00
    },
    {
      "name" : 'Ipad',
      "price" : 23000.00
    },
    

  ];

  title = 'My Angular App';


  toggleView(view:string){
     
     view === 'show'?this.showView = true : this.showView = false;


  }
}
