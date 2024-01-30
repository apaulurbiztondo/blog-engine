CREATE TABLE blog_post (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    content TEXT,
    url VARCHAR(50) NOT NULL,
    seo_title VARCHAR(255) NULL,
    seo_description VARCHAR(255) NULL,
    publication_date DATETIME DEFAULT CURRENT_TIMESTAMP
);
