package phuongtrang.business;

import phuongtrang.model.Product;

import java.util.List;

public interface IProductService {
    // định nghĩa các phương thức của menu chức năng
    List<Product> findAll();
}
