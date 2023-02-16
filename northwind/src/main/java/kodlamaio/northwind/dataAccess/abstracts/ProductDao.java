package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer> {
//entity yani product için integer sorguları hazırlıyor
//jparepository=yani hangi entity'e hangi veri tipiyle sorguların hazırlanması gerektiğini blabla

}
