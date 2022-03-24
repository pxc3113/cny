import os
from shutil import copyfile

l = ["i","ii","iii","iv","v","vi","vii","viii"]
for i in range(8):
    directory = os.fsencode("/home/l/jhipster/"+l[i]+"/src/main/java/com/"+l[i]+"/domain")
    os.makedirs("/home/l/Documents/Tencent Files/1709055990/FileRecv/过年作业/chinesenewyear/src/main/java/com/ytc/chinesenewyear/app"+str(i+1)+"/model/")
    for file in os.listdir(directory):
        filename=os.fsdecode(file)
        if filename in ["Authority.java","package-info.java","AbstractAuditingEntity.java","User.java"]:
            continue
        print(l[i],filename)
       
        copyfile("/home/l/jhipster/"+l[i]+"/src/main/java/com/"+l[i]+"/domain/"+filename,"/home/l/Documents/Tencent Files/1709055990/FileRecv/过年作业/chinesenewyear/src/main/java/com/ytc/chinesenewyear/app"+str(i+1)+"/model/"+filename)
