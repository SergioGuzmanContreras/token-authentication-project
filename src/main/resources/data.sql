INSERT INTO roles(name) VALUES('ROLE_ADMIN');
INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO users(username, email, password) VALUES ('admin', 'admin@admin.mx', '$2a$10$u/pGA/lUr3iG0qsaULQWzuvexIeWubZnoKy6EHInweJU66eYFQnwa');
INSERT INTO users(username, email, password) VALUES ('user', 'user@user.mx', '$2a$10$txzxOeZcEujOaecpLVQbzuDJurO72PhGhbPbOTOOyF00bmLJLAfl6');
INSERT INTO user_roles(id_user, id_role) VALUES (1, 1);
INSERT INTO user_roles(id_user, id_role) VALUES (1, 2);
INSERT INTO user_roles(id_user, id_role) VALUES (2, 2);