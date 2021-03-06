package sbs.service.downtimes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import sbs.model.downtimes.DowntimeCause;
import sbs.repository.GenericRepository;
import sbs.repository.downtimes.DowntimeCausesRepository;
import sbs.service.GenericServiceAdapter;

@Service
public class DowntimeCausesServiceImpl extends GenericServiceAdapter<DowntimeCause, Integer> implements DowntimeCausesService{
	
	private DowntimeCausesRepository downtimeCausesRepository;
	
    @Autowired
	public DowntimeCausesServiceImpl(@Qualifier("downtimeCausesRepositoryImpl") GenericRepository<DowntimeCause, Integer> genericRepository) {
			super(genericRepository);
			this.downtimeCausesRepository = (DowntimeCausesRepository) genericRepository;
	}

	@Override
	public boolean isIndependent(DowntimeCause cause) {
		return downtimeCausesRepository.isIndependent(cause);
	}

	@Override
	public List<DowntimeCause> findByType(String typeInternalTitle, boolean activeOnly) {
		return downtimeCausesRepository.findByType(typeInternalTitle, activeOnly);
	}

}
