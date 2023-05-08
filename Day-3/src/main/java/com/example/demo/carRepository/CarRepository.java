package com.example.demo.carRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.carModel.CarModel;

import jakarta.transaction.Transactional;
@Repository
public interface CarRepository extends JpaRepository<CarModel, Integer> {

	@Query(value="select * from Car",nativeQuery = true)
	public List<CarModel> getAllData();
    
    @Query(value="select * from Car where pid=:id",nativeQuery=true)
    public List<CarModel> bypid (@Param("id")int id);
    
    @Query(value="select * from Car where pid between :start and :end",nativeQuery=true)
    public List<CarModel> startEnd(@Param("start") int start,@Param("end")int end);
    
    @Modifying
    @Transactional
    @Query(value="delete from Car where pid=?1 and pname=?2",nativeQuery = true)
    Integer deleteD(@Param("pid") int pid,@Param ("pname") String pname);
    
    @Modifying
    @Transactional
    @Query(value="update Car set trainid=:pid where tname=:pname",nativeQuery=true)
    public void updateByQuery(@Param ("pid")int pid,@Param ("pname")String pname);
    
    @Query(value="select r from CarModel r")
    List<CarModel> jpqlQ();
   
    @Query(value="select r from CarModel r where r.pid=?1")
    public List<CarModel> jqByCon(@Param("sid")int sid);

}






