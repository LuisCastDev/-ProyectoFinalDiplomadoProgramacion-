package edu.programacion.avanzada.luiscastillo.ProyectoFinal.controller;

import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.request.product.CreateProductRequest;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.request.product.DeleteProductRequest;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.request.product.UpdateProductRequest;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.response.product.CreateProductResponse;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.response.product.DeleteProductResponse;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.response.product.GetProductResponse;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.model.response.product.UpdateProductResponse;
import edu.programacion.avanzada.luiscastillo.ProyectoFinal.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<GetProductResponse> get() {
        return ResponseEntity.ok(productService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetProductResponse> get(@PathVariable Long id) {
        return ResponseEntity.ok(productService.get(id));
    }

    @PostMapping
    public ResponseEntity<CreateProductResponse> create(@Valid @RequestBody CreateProductRequest createProductRequest) {
        return ResponseEntity.ok(productService.create(createProductRequest));
    }

    @PutMapping
    public ResponseEntity<UpdateProductResponse> update(@Valid @RequestBody UpdateProductRequest updateProductRequest) {
        return ResponseEntity.ok(productService.update(updateProductRequest));
    }

    @DeleteMapping
    public ResponseEntity<DeleteProductResponse> delete(@Valid @RequestBody DeleteProductRequest deleteEmployeeRequest) {
        return ResponseEntity.ok(productService.delete(deleteEmployeeRequest));
    }
}
