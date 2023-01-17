CREATE TABLE Thematique(
    id SERIAL PRIMARY KEY,
    nomThematique varchar(50),
    etat int DEFAULT 0
);

CREATE TABLE Type(
    id SERIAL PRIMARY KEY,
    nomType varchar(50),
    number varchar(50),
    subject varchar(50),
    state int DEFAULT 0,
    notes varchar(50),
    sources varchar(50),
    contentMG TEXT,
    contentFR TEXT,
    idThematique int REFERENCES Thematique(id),
    icon varchar(50),
    common boolean,
    etat int DEFAULT 0
);


CREATE TABLE Titre(
    id SERIAL PRIMARY KEY,
    titre varchar(50),
    idType int REFERENCES Type(id)
);

INSERT INTO Titre VALUES 
(DEFAULT,'Test1',1),
(DEFAULT,'Test2',2),
(DEFAULT,'Test21',2),
(DEFAULT,'Test2',3);

CREATE TABLE Chapitre(
    id SERIAL PRIMARY KEY,
    chapitre varchar(50),
    idTitre int REFERENCES Titre(id)
);

INSERT INTO Chapitre VALUES 
(DEFAULT,'Test1',1),
(DEFAULT,'Test2',2),
(DEFAULT,'Test21',2),
(DEFAULT,'Test2',3);

CREATE TABLE Section(
    id SERIAL PRIMARY KEY,
    section varchar(50),
    idChapitre int REFERENCES Chapitre(id)
);

INSERT INTO Section VALUES 
(DEFAULT,'Test1',1),
(DEFAULT,'Test2',2),
(DEFAULT,'Test21',2),
(DEFAULT,'Test2',3);


CREATE TABLE sousSection(
    id SERIAL PRIMARY KEY,
    sousSection varchar(50),
    idSection int REFERENCES Section(id)
);

INSERT INTO sousSection VALUES 
(DEFAULT,'Test1',5),
(DEFAULT,'Test2',6),
(DEFAULT,'Test21',6),
(DEFAULT,'Test2',7);

CREATE TABLE Article(
    id SERIAL PRIMARY KEY,
    article varchar(50),
    idSousSection int REFERENCES sousSection(id)
);

INSERT INTO Article VALUES 
(DEFAULT,'Test1',21),
(DEFAULT,'Test2',22),
(DEFAULT,'Test21',22),
(DEFAULT,'Test2',23);

CREATE TABLE Alinea(
    id SERIAL PRIMARY KEY,
    alinea varchar(50),
    idArticle int REFERENCES Article(id)
);

INSERT INTO Alinea VALUES 
(DEFAULT,'Test1',5),
(DEFAULT,'Test2',6),
(DEFAULT,'Test21',6),
(DEFAULT,'Test2',7);

CREATE OR REPLACE VIEW TypeThematique AS
SELECT  Type.*,Thematique.nomThematique
FROM Type
LEFT JOIN Thematique
ON Type.idThematique = Thematique.id;
