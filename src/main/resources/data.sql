INSERT INTO footers (id,address,phoneNumber,aboutMe,email,city,sentenceAboutMe) VALUES (1,'Block 7 Lot 1 Income Street Bir Village','09265016371','AboutMe!','JuanDelacruz@gmail.com','QuezonCity','Hi, you can call me AJ. I was born in Isabela Province and My hobby is Playing Basketball. My goal in life is to improve my skills.');
--INSERT INTO public.footers (id,address,phoneNumber,aboutMe,email,city,sentenceAboutMe) VALUES (2,'Block 7 Lot 1 Income Street Bir Village','09265016371','AboutMe','JuanDelacruz@gmail.com','Hi, you can call me AJ. I was born in Isabela Province and My hobby is Playing Basketball. My goal in life is to improve my skills.');
--
--INSERT INTO achievements (id,graduateOf,graduateDescription,bestInThesis,thesisDescription,ciscoCertified,ciscoDescription) VALUES (1,'Graduate of','Bachelor of Science in Computer Engineering','Best in Thesis','Philippine Aerial Geolocation And Surveillance Assistant','Cisco','Cisco certified');
INSERT INTO achievements(id,avatar,title,description)
VALUES(1,'https://drive.google.com/file/d/1-jpxRKGEqYNrtEZMEz1Ov0Kuh1KwgQ7A/view','Graduate of ','Bachelor of Science in Computer Engineering'),(2,'https://drive.google.com/file/d/1-nX6d5XnrBiWVNEuRiKnmy9BnGDRPyCJ/view','Best In Thesis','Philippine Aerial Geolocation And Surveillance Assistant'),(3,'','Cisco','Cisco certified');

INSERT INTO forms (id,name,lastname,email,number,details,submit)
VALUES(1,'Your_Name','YourLastName','Email','Number','Details','Submit');

INSERT INTO navbars (id,name,homes,achievements,training,contact)
VALUES (1,'AJCG','Home','Achievements','Training','Contact');

INSERT INTO trainings(id,name,about,press,image)
VALUES (1,'Training',' My first training was CSV bootcamp and Am looking forward, when our company is opening new trainings. Am willing to give my time on it, to learn new technologies.','Please pressMe!','https://drive.google.com/file/d/10BZU2HkqwVVgdd4wUcmsbVCq1mA_IXQi/view');

INSERT INTO training_image(id,images)
VALUES(1,'training1.jpg'),
(2,'training2.jpg'),
(3,'training3.jpg'),
(4,'training4.jpg'),
(5,'training5.jpg'),
(6,'training6.jpg');

INSERT INTO home(id,greetings,name,occupation,achievements,launch)
 VALUES(1,'Hi! I am','Alexander James Gutierrez','Junior Software Engineer','Achievements','Contact');

INSERT INTO home_image(id,images)VALUES(1,'nasa.jpg'),(2,'aj.jpg');

INSERT INTO heros(id,background,text) VALUES(1,'nasa.jpg','Text');
