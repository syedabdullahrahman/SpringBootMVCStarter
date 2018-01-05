package sbs.repository.qualitysurveys;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import sbs.model.qualitysurveys.QualitySurvey;
import sbs.repository.GenericRepositoryAdapter;

@Repository
@Transactional
public class QualitySurveysRepositoryImpl extends GenericRepositoryAdapter<QualitySurvey, Integer>
		implements QualitySurveysRepository {

	@SuppressWarnings("unchecked")
	@Override
	public List<QualitySurvey> findAllDesc() {
		Criteria crit = currentSession().createCriteria(QualitySurvey.class);
		crit.addOrder(Order.desc("id"));
		return crit.list();
	}
	
}
