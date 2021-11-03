import {Observable} from "rxjs";
import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Product} from "./product";
import {environment} from "../environments/environment";

@Injectable({
  providedIn: "root"
})
export class BackendService {

  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) {
  }

  public getProducts(): Observable<Product[]> {
    return this.http.get<Product[]>(`${this.apiServerUrl}/products`);
  }

  public addProducts(product: Product): Observable<Product> {
    return this.http.post<Product>(`${this.apiServerUrl}/products`, product);
  }

  // public updateProducts(product: Product): Observable<Product> {
  //   return this.http.put<Product>(`${this.apiServerUrl}/products`, product);
  // }
  //
  // public deleteProducts(productId: string): Observable<void> {
  //   return this.http.delete<void>(`${this.apiServerUrl}/products/${productId}`);
  // }
}
