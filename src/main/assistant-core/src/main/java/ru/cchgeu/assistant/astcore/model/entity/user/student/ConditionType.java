package ru.cchgeu.assistant.astcore.model.entity.user.student;

public enum ConditionType {
    IS_STUDENT,                                     //Является студентом
    IS_APPLICANT,                                   //Является соискателем
    IS_LISTENER,                                    //Является слушателем
    IS_DOCTORAL_STUDENT,                            //Является докторантом
    IS_GRADUATE,                                    //Является выпускником
    IS_GRADUATE_STUDENT,                            //Является аспирантом
    IS_ACADEMIC_LEAVE,                              //Находится в академическом отпуске
    EXPELLED,                                       //Отчислен
    DEBTOR,                                         //Задолжник
    GRADEBOOK_IS_CLOSED                             //Зачётная книжка закрыта
}
