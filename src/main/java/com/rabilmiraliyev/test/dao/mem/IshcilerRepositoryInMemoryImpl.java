package com.rabilmiraliyev.test.dao.mem;

import org.springframework.stereotype.Repository;


@Repository
public class IshcilerRepositoryInMemoryImpl {

//	private Map<Long ,Ishciler> ishcilersMap = new HashMap<>();
//	
//	public IshcilerRepositoryInMemoryImpl() {
//		Ishciler ishci1=new Ishciler();
//		ishci1.setId(1L);
//		ishci1.setAd("Eli");
//		ishci1.setSoyad("Eliyev");
//		ishci1.setDogumTarixi(1990);
//		ishci1.setBolme1("Operator");
//		ishci1.setUnvan("Baki");
//		ishci1.setMaas(700);
//		
//		
//		Ishciler ishci2=new Ishciler();
//		ishci2.setId(2L);
//		ishci2.setAd("Veli");
//		ishci2.setSoyad("Veliyev");
//		ishci2.setDogumTarixi(1991);
//		ishci2.setBolme1("Surucu");
//		ishci2.setUnvan("Baki");
//		ishci2.setMaas(500);
//		
//		ishcilersMap.put(ishci1.getId(), ishci1);
//		ishcilersMap.put(ishci2.getId(), ishci2);
//		
//	}
//	@Override
//	public List<Ishciler> findAll() {
//		// TODO Auto-generated method stub
//		return new ArrayList<Ishciler>(ishcilersMap.values());
//	}
//
////	@Override
////	public Ishciler findById(Long id) {
////		
////		return ishcilersMap.get(id);
////	}
//
//	@Override
//	public void create(Ishciler ishciler) {
//		ishciler.setId(new Date().getTime());
//		ishcilersMap.put(ishciler.getId(), ishciler);
//	}
//
//	@Override
//	public Ishciler update(Ishciler ishciler) {
//		ishcilersMap.replace(ishciler.getId(), ishciler);
//		return ishciler;
//	}
//
//	@Override
//	public void delete(Long id) {
//		ishcilersMap.remove(id);
//
//	}
//	@Override
//	public List<Ishciler> findAll(Sort sort) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public List<Ishciler> findAllById(Iterable<Long> ids) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public <S extends Ishciler> List<S> saveAll(Iterable<S> entities) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public void flush() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public <S extends Ishciler> S saveAndFlush(S entity) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public void deleteInBatch(Iterable<Ishciler> entities) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void deleteAllInBatch() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public Ishciler getOne(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public <S extends Ishciler> List<S> findAll(Example<S> example) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public <S extends Ishciler> List<S> findAll(Example<S> example, Sort sort) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public Page<Ishciler> findAll(Pageable pageable) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public <S extends Ishciler> S save(S entity) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public Optional<Ishciler> findById(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public boolean existsById(Long id) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	@Override
//	public long count() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	@Override
//	public void deleteById(Long id) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void delete(Ishciler entity) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void deleteAll(Iterable<? extends Ishciler> entities) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void deleteAll() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public <S extends Ishciler> Optional<S> findOne(Example<S> example) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public <S extends Ishciler> Page<S> findAll(Example<S> example, Pageable pageable) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public <S extends Ishciler> long count(Example<S> example) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	@Override
//	public <S extends Ishciler> boolean exists(Example<S> example) {
//		// TODO Auto-generated method stub
//		return false;
//	}
}