package sbs.service.qsurveys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import sbs.model.qsurveys.QSurveyBomAnswer;
import sbs.repository.GenericRepository;
import sbs.repository.qsurveys.QSurveyBomAnswersRepository;
import sbs.service.GenericServiceAdapter;

@Service
public class QSurveyBomAnswersServiceImpl extends GenericServiceAdapter<QSurveyBomAnswer, Integer> implements QSurveyBomAnswersService{
	
	@SuppressWarnings("unused")
	private QSurveyBomAnswersRepository qSurveyBomAnswersRepository;
	
    @Autowired
	public QSurveyBomAnswersServiceImpl(@Qualifier("qSurveyBomAnswersRepositoryImpl") GenericRepository<QSurveyBomAnswer, Integer> genericRepository) {
			super(genericRepository);
			this.qSurveyBomAnswersRepository = (QSurveyBomAnswersRepository) genericRepository;
	}
	

}
