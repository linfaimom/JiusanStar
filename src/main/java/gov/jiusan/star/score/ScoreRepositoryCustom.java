package gov.jiusan.star.score;

/**
 * 自定义的 Repository 必须以 Custom 结尾
 *
 * @author Marcus Lin
 */
interface ScoreRepositoryCustom {

    void create(Score entity);

    void update(Score entity);
}
