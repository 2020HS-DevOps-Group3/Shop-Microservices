import {Component, OnInit} from '@angular/core';
import {BackendService} from "./backend.service";
import {HttpErrorResponse} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'Tomato - Hungry? Order from Tomato';

  public products: any =[];

  constructor(private backendService: BackendService) {}

  public getProducts(): void {
    this.backendService.getProducts()
      .subscribe((response: any) => {
        this.products = response.results;
        console.log(this.products);
      }, (error: HttpErrorResponse) => {
        // alert(error.message);
      }
    );
  }

  ngOnInit(): void {
    this.getProducts();
  }
}
