package ugportal.model;

import java.io.Serializable;

import com.google.appengine.api.datastore.Link;

/**
 * {@link Setting} stores setting (links to blog source and twitter)
 * 
 * @author Tomas Vantuch
 */
public class Setting implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 4521107222049601989L;
    /**
     * link to Twitter to download tweets
     */
    private Link linkTwitter;
    /**
     * link to Blog -portal for creating connection between blogPost and real
     * blog
     */
    private Link linkBlogPost;

    private Blog blog;

    /**
     * Returns the blog.
     * 
     * @return the blog
     */
    public Blog getBlog() {
        return blog;
    }

    /**
     * Sets the blog.
     * 
     * @param blog
     *            the blog to set
     */
    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    /**
     * Returns the link of twitter
     * 
     * @return the link of twitter
     */
    public Link getLinkTwitter() {
        return linkTwitter;
    }

    /**
     * Sets the linkTwitter
     * 
     * @param linkTwitter
     *            to set the linkTwitter
     */
    public void setLinkTwitter(Link linkTwitter) {
        this.linkTwitter = linkTwitter;
    }

    /**
     * Returns the LinkBlogPost
     * 
     * @return the LinkBlogPost
     */
    public Link getLinkBlogPost() {
        return linkBlogPost;
    }

    /**
     * Sets the LinkBlogPost
     * 
     * @param linkBlogPost
     *            to set the LinkBlogPost
     */
    public void setLinkBlogPost(Link linkBlogPost) {
        this.linkBlogPost = linkBlogPost;
    }

}
