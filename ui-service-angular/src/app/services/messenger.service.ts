import {Injectable} from '@angular/core';
import {Subject} from "rxjs";
import {Product} from "../models/product";

@Injectable({
  providedIn: 'root'
})
export class MessengerService {

  subject = new Subject();

  constructor() {
  }

  sendMessage(product: Product) {
    this.subject.next(product); // Triggering an event
  }

  getMessage() {
    return this.subject.asObservable();
  }
}
