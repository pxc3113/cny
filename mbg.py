import mysql.connector

cnx_config = {
    "host": "localhost",
    "port": "3306",
    "database": "CNY",
    "user": "root",
    "password": "root"
}

cnx = mydb = mysql.connector.connect(
    host = cnx_config["host"],
    port = cnx_config["port"],
    database = cnx_config["database"],
    user = cnx_config["user"],
    password = cnx_config["password"]
)

mycursor = cnx.cursor()

mycursor.execute("show tables;")
mycursor.fetchall()
apps = [
    [
        ('i_user', ),
        ('dept', ),
        ('tree', ),
    ],
    [
        ('ii_user', ),
        ('hospital', ),
        ('doctor', ),
        ('ii_tree', ),
    ],
    [
        ('iii_user', ),
        ('user_type', ),
    ],
    [
        ('iv_user', ),
        ('iv_book', ),
        ('iv_book_type', ),
    ],
    [
        ('v_book', ),
        ('v_book_type', ),
        ('press', ),
    ],
    [
        ('prize', ),
        ('luck_history', ),
    ],
    [
        ('vii_class', )
        ('electric_meter', ),
    ],
    [
        ('purchase', ),
        ('status', ),
    ]
]