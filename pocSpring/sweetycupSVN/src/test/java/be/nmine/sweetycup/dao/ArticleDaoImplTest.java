//package be.nmine.sweetycup.dao;
//
//import static org.fest.assertions.api.Assertions.assertThat;
//
//import javax.inject.Inject;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = { "classpath:root-context.xml" })
//public class ArticleDaoImplTest {
//
//	@Inject
//	private ArticleDao articleDao;
//	
//	@Test
//	public void testSave() {
//	}
//
//	@Test
//	public void testFind() {
//		assertThat(articleDao.findByTitle("Sweety Cup").size()).isEqualTo(2);
//	}
//
//	@Test
//	public void testFindArticles() {
//		assertThat(articleDao.findArticles().size()).isEqualTo(5);
//	
//	}
//
//}
