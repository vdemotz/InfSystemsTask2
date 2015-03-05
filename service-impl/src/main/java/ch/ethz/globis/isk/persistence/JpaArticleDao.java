package ch.ethz.globis.isk.persistence;

import java.util.List;

import ch.ethz.globis.isk.domain.Article;

public class JpaArticleDao extends JpaDao<String, Article> implements ArticleDao {

	@Override
	public Article createEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Article findOneByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> findByJournalEditionOrderedByYear(
			String journalEditionId) {
		// TODO Auto-generated method stub
		return null;
	}

}
