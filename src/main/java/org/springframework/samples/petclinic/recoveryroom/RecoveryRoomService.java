package org.springframework.samples.petclinic.recoveryroom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class RecoveryRoomService {
	
	@Autowired
	private RecoveryRoomRepository roomrepository;
	
    public List<RecoveryRoom> getAll(){
        List<RecoveryRoom> lista = roomrepository.findAll();
        return lista;
    }

    public List<RecoveryRoomType> getAllRecoveryRoomTypes(){
        List<RecoveryRoomType> lista = roomrepository.findAllRecoveryRoomTypes();
        return lista;
    }

    public RecoveryRoomType getRecoveryRoomType(String typeName) {
        RecoveryRoomType tipo = roomrepository.getRecoveryRoomType(typeName);
        return tipo;
    }

    public List<RecoveryRoom> getRecoveryRoomsBiggerThan(double size) {
        List<RecoveryRoom> lista = roomrepository.findBySizeMoreThan(size);
        return lista;
    }

    public RecoveryRoom save(RecoveryRoom p) {
        return null;       
    }

    
}
