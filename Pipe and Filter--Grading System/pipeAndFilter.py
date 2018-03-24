''' A simple grading system application done in pipe and filter arcitecture.
    It coverts grade and calcultes the grade point and finally calcultes
    the semster GPA.
    
    Meron Terefe
    Ate/9384/08
    

'''



class Course(object):
    def __init__(self, point, ects):
        self.point = point
        self.ects = ects
        self.grade = ""
        self.grade_poit = 0

def grade_report(crs1, crs2):
    list_of_courses = [crs1, crs2]
    convert_to_grade(list_of_courses)


def convert_to_grade(list_of_courses):
    for i in range(len(list_of_courses)):
        if(list_of_courses[i].point > 90):
            list_of_courses[i].grade = "A+"
        elif(list_of_courses[i].point > 83):
            list_of_courses[i].grade = "A"
        elif(list_of_courses[i].point > 80):
            list_of_courses[i].grade = "A-"
        elif(list_of_courses[i].point > 75):
            list_of_courses[i].grade = "B+"
        elif(list_of_courses[i].point > 68):
            list_of_courses[i].grade = "B"
        elif(list_of_courses[i].point > 65 ):
            list_of_courses[i].grade = "B-"
        elif(list_of_courses[i].point > 60):
            list_of_courses[i].grade = "C+"
        elif(list_of_courses[i].point > 50):
            list_of_courses[i].grade = "C"
        elif(list_of_courses[i].point > 45):
            list_of_courses[i].grade = "c-"
        elif(list_of_courses[i].point > 40):
            list_of_courses[i].grade = "D"
        elif(list_of_courses[i].point > 30):
            list_of_courses[i].grade = "D"
        else:
            list_of_courses[i].grade = "F"

            
    convert_to_grade_poit(list_of_courses)

def convert_to_grade_poit(list_of_courses):
    total_ects = 0
    for i in range(len(list_of_courses)):
         total_ects += list_of_courses[i].ects 
        
    for i in range(len(list_of_courses)):
        if list_of_courses[i].grade == "A+" or list_of_courses[i].grade == "A":
            list_of_courses[i].grade_point = (list_of_courses[i].ects * 4)/total_ects
        elif list_of_courses[i].grade == "A-":
            list_of_courses[i].grade_point = (list_of_courses[i].ects * 3.75)/total_ects
        elif list_of_courses[i].grade == "B+":
            list_of_courses[i].grade_point = (list_of_courses[i].ects * 3.5)/total_ects
        elif list_of_courses[i].grade == "B":
            list_of_courses[i].grade_point = (list_of_courses[i].ects * 3)/total_ects
        elif list_of_courses[i].grade == "B-":
            list_of_courses[i].grade_point = (list_of_courses[i].ects * 2.75)/total_ects
        elif list_of_courses[i].grade == "C+":
            list_of_courses[i].grade_point = (list_of_courses[i].ects * 2.5)/total_ects
        elif list_of_courses[i].grade == "C":
            list_of_courses[i].grade_point = (list_of_courses[i].ects * 2)/total_ects
        elif list_of_courses[i].grade == "C-":
            list_of_courses[i].grade_point = (list_of_courses[i].ects * 1.75)/total_ects
        elif list_of_courses[i].grade == "D":
            list_of_courses[i].grade_point = (list_of_courses[i].ects * 1)/total_ects
        else :
            list_of_courses[i].grade_point = (list_of_courses[i].ects * 0)/total_ects
    calculate_sgpa(list_of_courses)


def calculate_sgpa(list_of_courses):
    sgpa = 0
    for i in range(len(list_of_courses)):
        sgpa += list_of_courses[i].grade_point

    print(sgpa)


Dynamics = Course(80, 7)
Statics = Course(90, 5)
grade_report(Dynamics, Statics)



