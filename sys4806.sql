CREATE TABLE "users_login" (
  "id" SERIAL PRIMARY KEY,
  "name" varchar,
  "externalid" varchar
);

CREATE TABLE "survey" (
  "id" SERIAL PRIMARY KEY,
  "closed" boolean,
  "name" varchar,
  "creator_id" int
);

CREATE TABLE "question" (
  "id" SERIAL PRIMARY KEY,
  "dtype" varchar,
  "prompt" varchar,
  "type" int,
  "survey_id" int,
  "max" int,
  "min" int
);

CREATE TABLE "reponse" (
  "id" SERIAL PRIMARY KEY,
  "dtype" varchar,
  "type" int,
  "answer" varchar,
  "question_id" int
);

CREATE TABLE "question_choice" (
  "question_id" int PRIMARY KEY,
  "choices" varchar
);

ALTER TABLE "survey" ADD FOREIGN KEY ("creator_id") REFERENCES "users_login" ("id");

ALTER TABLE "question" ADD FOREIGN KEY ("survey_id") REFERENCES "survey" ("id");

ALTER TABLE "reponse" ADD FOREIGN KEY ("question_id") REFERENCES "question" ("id");

ALTER TABLE "question_choice" ADD FOREIGN KEY ("question_id") REFERENCES "question" ("id");
