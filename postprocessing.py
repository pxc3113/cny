# import os
# from shutil import copyfile
# entities = [
#     [
#         ('i_user', ),
#         ('dept', ),
#         ('tree', ),
#     ],
#     [
#         ('ii_user', ),
#         ('hospital', ),
#         ('doctor', ),
#         ('ii_tree', ),
#     ],
#     [
#         ('iii_user', ),
#         ('user_type', ),
#     ],
#     [
#         ('iv_user', ),
#         ('iv_book', ),
#         ('iv_book_type', ),
#     ],
#     [
#         ('v_book', ),
#         ('v_book_type', ),
#         ('press', ),
#     ],
#     [
#         ('prize', ),
#         ('luck_history', ),
#     ],
#     [
#         ('vii_class', ),
#         ('electric_meter', ),
#     ],
#     [
#         ('purchase', ),
#         ('status', ),
#     ]
# ]
# servicecode = []
# base_ = "/home/l/Documents/Tencent Files/1709055990/FileRecv/过年作业/chinesenewyear/src/main/java/com/ytc/chinesenewyear/app"
# TicketService = "/home/l/Documents/Tencent Files/1709055990/FileRecv/dec29/src/main/java/com/ytc/dec29/service/TicketService.java"
# TicketServiceImpl = "/home/l/Documents/Tencent Files/1709055990/FileRecv/dec29/src/main/java/com/ytc/dec29/service/impl/TicketServiceImpl.java"
# TicketDao = "/home/l/Documents/Tencent Files/1709055990/FileRecv/dec29/src/main/java/com/ytc/dec29/dao/TicketDao.java"
# TicketController = "/home/l/Documents/Tencent Files/1709055990/FileRecv/dec29/src/main/java/com/ytc/dec29/controller/TicketController.java"
# TicketWebPage = "/home/l/Documents/Tencent Files/1709055990/FileRecv/dec29/src/main/resources/templates/results.html"
# CNYTemplates = "/home/l/Documents/Tencent Files/1709055990/FileRecv/过年作业/chinesenewyear/src/main/resources/templates/"
# text = lambda entity: "<td th:text=\"${"+entity+".id}\"></td>"
# for i in range(8):
#     base = "/home/l/Documents/Tencent Files/1709055990/FileRecv/过年作业/chinesenewyear/src/main/java/com/ytc/chinesenewyear/app"+str(i+1)

#     directory = os.fsencode(base+"/model")
    
#     for file in os.listdir(directory):
#         fileName = os.fsdecode(file)
#         entity = fileName.split(".")[0]

#         #Change "Integer id" to "Long id"
#         f = open(base+"/controller/"+entity+"Controller.java", "rt")
#         data = f.read()
#         data=data.replace("Optional<Long>","Optional<Integer>")
#         f.close()

#         f = open(base+"/controller/"+entity+"Controller.java", "w")
#         f.write(data)
#         f.close()

#         #Generate service interfaces for each entity of each app
#         # uncomment this to reset
#         # copyfile(TicketService,base+"/service/"+entity+"Service.java")
        
#         # f = open(base+"/service/"+entity+"Service.java", "rt")
#         # data = f.read()
#         # data=data.replace(
#         # '/** \n * <pre>项目名称:java2021-12-28-x \n * 文件名称:TicketService.java \n * 包名:com.ytc.service \n * 创建日期:2021年12月28日下午2:05:16 \n * Copyright (c) 2021,  All Rights Reserved.</pre> \n */  \n', "").replace("Ticket",entity).replace("ticket",entity.lower()).replace("package com.ytc.dec29.service;","package com.ytc.chinesenewyear.app"+str(i+1)+".service;").replace("import com.ytc.dec29.model.*;","import com.ytc.chinesenewyear.app"+str(i+1)+".model.*;")
#         # f.close()

#         # f = open(base+"/service/"+entity+"Service.java", "w")
#         # f.write(data)
#         # f.close()
#         #chang integer to long
#         # uncomment this to reset
#         # copyfile(TicketService,base+"/service/"+entity+"Service.java")
        
#         #Generate service impl for each entity of each app
#         # f = open(base+"/service/impl/"+entity+"ServiceImpl.java", "rt")
#         # data = f.read()
#         # data=data.replace("Ticket",entity).replace("ticket",entity.lower()).replace("com.ytc.dec29","com.ytc.chinesenewyear.app"+str(i+1))
#         # f.close()

#         # f = open(base+"/service/impl/"+entity+"ServiceImpl.java", "w")
#         # f.write(data)
#         # f.close()
#         #change integer to long
#         f = open(base+"/service/impl/"+entity+"ServiceImpl.java", "rt")
#         data = f.read()
#         data=data.replace("Integer","Long")
#         f.close()

#         f = open(base+"/service/impl/"+entity+"ServiceImpl.java", "w")
#         f.write(data)
#         f.close()

#         #generate dao layer for each entity of each app
#         # copyfile(TicketDao,base+"/dao/"+entity+"Dao.java")
#         # f = open(base+"/dao/"+entity+"Dao.java", "rt")
#         # data = f.read()
#         # data=data.replace("Ticket",entity).replace("ticket",entity.lower()).replace("com.ytc.dec29","com.ytc.chinesenewyear.app"+str(i+1))
#         # f.close()

#         # f = open(base+"/dao/"+entity+"Dao.java", "wt")
#         # f.write(data)
#         # f.close()
#         # Replace Integer with Long in Dao
#         f = open(base+"/dao/"+entity+"Dao.java", "rt")
#         data = f.read()
#         data=data.replace("Integer","Long")
#         f.close()

#         f = open(base+"/dao/"+entity+"Dao.java", "wt")
#         f.write(data)
#         f.close()
#         #generate controller layer for each entity of each app
#         # copyfile(TicketController,base+"/controller/"+entity+"Controller.java")
#         # f = open(base+"/controller/"+entity+"Controller.java", "rt")
#         # data = f.read()
#         # data=data.replace("Ticket",entity).replace("ticket",entity.lower()).replace("com.ytc.dec29","com.ytc.chinesenewyear.app"+str(i+1))
#         # f.close()

#         # f = open(base+"/controller/"+entity+"Controller.java", "wt")
#         # f.write(data)
#         # f.close()

#         #generate thymeleaf template homepage for each entity of each app
#         try:
#             os.mkdir(CNYTemplates+"app"+str(i+1))
#         except FileExistsError:
#             pass
#         copyfile(TicketWebPage,CNYTemplates+"app"+str(i+1)+"/"+entity+"List.html")
#         f = open(CNYTemplates+"app"+str(i+1)+"/"+entity+"List.html", "rt")
#         data = f.read()
#         data=data.replace("Ticket",entity).replace("ticket",entity.lower())
#         f.close()

#         f = open(CNYTemplates+"app"+str(i+1)+"/"+entity+"List.html", "wt")
#         f.write(data)
#         f.close()

# # # list to store file lines
# # lines = []
# # # read file
# # with open(r"E:\demos\files\sample.txt", 'r') as fp:
# #     # read an store all lines into list
# #     lines = fp.readlines()

# # # Write file
# # with open(r"E:\demos\files\sample.txt", 'w') as fp:
# #     # iterate each line
#     # for number, line in enumerate(lines):
#     #     # delete line 5 and 8. or pass any Nth line you want to remove
#     #     # note list index starts from 0
#     #     if number not in [4, 7]:
#     #         fp.write(line)