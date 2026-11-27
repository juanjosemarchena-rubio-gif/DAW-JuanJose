CREATE DATABASE IF NOT EXISTS www;
USE www;


CREATE TABLE Shippers (
    ShipperID   INT PRIMARY KEY,
    ShipperName VARCHAR(80),
    Phone       VARCHAR(20)
);


CREATE TABLE Customers (
    CustomerID   INT PRIMARY KEY,
    CustomerName VARCHAR(80),
    ContactName  VARCHAR(80),
    Address      VARCHAR(120),
    City         VARCHAR(60),
    PostalCode   VARCHAR(20),
    Country      VARCHAR(20)
);


CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    LastName   VARCHAR(120),
    FirstName  VARCHAR(80),
    BirthDate  DATE,
    Photo      VARCHAR(120),
    Notes      VARCHAR(300)
);


CREATE TABLE Categories (
    CategoryID   INT PRIMARY KEY,
    CategoryName VARCHAR(50),
    Description  VARCHAR(120)
);


CREATE TABLE Suppliers (
    SupplierID   INT PRIMARY KEY,
    SupplierName VARCHAR(40),
    ContactName  VARCHAR(80),
    Address      VARCHAR(120),
    City         VARCHAR(120),
    PostalCode   VARCHAR(10),
    Country      VARCHAR(50),
    Phone        VARCHAR(20)
);


CREATE TABLE Products (
    ProductID   INT PRIMARY KEY,
    ProductName VARCHAR(50),
    SupplierID  INT,
    CategoryID  INT,
    Unit        VARCHAR(50),
    Price       DECIMAL(10,2),
    FOREIGN KEY (SupplierID) REFERENCES Suppliers(SupplierID),
    FOREIGN KEY (CategoryID) REFERENCES Categories(CategoryID)
);


CREATE TABLE Orders (
    OrderID    INT PRIMARY KEY,
    CustomerID INT,
    EmployeeID INT,
    OrderDate  DATE,
    ShipperID  INT,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID),
    FOREIGN KEY (EmployeeID) REFERENCES Employees(EmployeeID),
    FOREIGN KEY (ShipperID)  REFERENCES Shippers(ShipperID)
);


CREATE TABLE OrderDetails (
    OrderDetailID INT PRIMARY KEY,
    OrderID       INT,
    ProductID     INT,
    Quantity      INT,
    FOREIGN KEY (OrderID)   REFERENCES Orders(OrderID),
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID)
);


-- Datos generados con Mockaroo (30 filas por tabla).
-- Orden de inserción: primero las tablas sin claves foráneas, después las que dependen de ellas.

-- Shippers
insert into Shippers (ShipperID, ShipperName, Phone) values (1, 'Zoozzy', '374-649-2146');
insert into Shippers (ShipperID, ShipperName, Phone) values (2, 'Mynte', '728-107-6848');
insert into Shippers (ShipperID, ShipperName, Phone) values (3, 'Yodel', '878-860-6010');
insert into Shippers (ShipperID, ShipperName, Phone) values (4, 'Pixoboo', '464-101-0676');
insert into Shippers (ShipperID, ShipperName, Phone) values (5, 'Fivebridge', '361-182-7231');
insert into Shippers (ShipperID, ShipperName, Phone) values (6, 'Abata', '312-736-3678');
insert into Shippers (ShipperID, ShipperName, Phone) values (7, 'Riffwire', '549-695-4703');
insert into Shippers (ShipperID, ShipperName, Phone) values (8, 'Voonder', '426-682-0188');
insert into Shippers (ShipperID, ShipperName, Phone) values (9, 'Linklinks', '912-328-2804');
insert into Shippers (ShipperID, ShipperName, Phone) values (10, 'Browseblab', '773-456-1995');
insert into Shippers (ShipperID, ShipperName, Phone) values (11, 'Brainverse', '480-431-9304');
insert into Shippers (ShipperID, ShipperName, Phone) values (12, 'Twimbo', '540-221-0267');
insert into Shippers (ShipperID, ShipperName, Phone) values (13, 'Kayveo', '116-195-3806');
insert into Shippers (ShipperID, ShipperName, Phone) values (14, 'Youbridge', '149-889-9503');
insert into Shippers (ShipperID, ShipperName, Phone) values (15, 'Avavee', '626-238-6610');
insert into Shippers (ShipperID, ShipperName, Phone) values (16, 'Eabox', '193-268-6465');
insert into Shippers (ShipperID, ShipperName, Phone) values (17, 'Aibox', '369-895-0430');
insert into Shippers (ShipperID, ShipperName, Phone) values (18, 'Feedbug', '175-213-6520');
insert into Shippers (ShipperID, ShipperName, Phone) values (19, 'Snaptags', '968-620-4797');
insert into Shippers (ShipperID, ShipperName, Phone) values (20, 'Jaxspan', '950-740-1220');
insert into Shippers (ShipperID, ShipperName, Phone) values (21, 'Vimbo', '139-590-9665');
insert into Shippers (ShipperID, ShipperName, Phone) values (22, 'Jaxbean', '275-219-6903');
insert into Shippers (ShipperID, ShipperName, Phone) values (23, 'Kwideo', '675-848-5205');
insert into Shippers (ShipperID, ShipperName, Phone) values (24, 'Wordtune', '212-779-2811');
insert into Shippers (ShipperID, ShipperName, Phone) values (25, 'Twitterlist', '235-554-1602');
insert into Shippers (ShipperID, ShipperName, Phone) values (26, 'Centimia', '762-457-2306');
insert into Shippers (ShipperID, ShipperName, Phone) values (27, 'Ntag', '195-591-0262');
insert into Shippers (ShipperID, ShipperName, Phone) values (28, 'Divape', '326-866-3272');
insert into Shippers (ShipperID, ShipperName, Phone) values (29, 'Quimm', '719-588-2982');
insert into Shippers (ShipperID, ShipperName, Phone) values (30, 'Feedbug', '779-953-9202');

-- Customers
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (1, 'Kamba', 'Janek Feavyour', '3590 Sunfield Junction', 'Lisków', '62-850', 'Poland');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (2, 'Brainverse', 'Krista Perrygo', '87432 Dottie Lane', 'Jianqiao', null, 'China');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (3, 'Twiyo', 'Marcela Elden', '35 Ramsey Trail', 'Lepanto', '2417', 'Philippines');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (4, 'Eadel', 'Tarrance Bynold', '82 Crownhardt Trail', 'Jelisavac', '31225', 'Croatia');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (5, 'Roodel', 'Templeton Heustace', '01 Corry Junction', 'Kuandian', null, 'China');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (6, 'Meevee', 'Kaleb Rove', '60208 Mifflin Circle', 'Tahara', '879-7305', 'Japan');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (7, 'Realcube', 'Tootsie Speachley', '34768 Rieder Drive', 'Palmital', '19970-000', 'Brazil');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (8, 'Abata', 'Carlyn Elliker', '7956 Oak Valley Place', 'Haduohe', null, 'China');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (9, 'Youbridge', 'Gib Toulamain', '85152 Oakridge Point', 'Terpinnya', null, 'Ukraine');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (10, 'Tazzy', 'Riobard Merrill', '09 South Street', 'Jiuxian', null, 'China');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (11, 'Skyba', 'Dena Axby', '87 Raven Terrace', 'Storvreta', '743 91', 'Sweden');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (12, 'Lazz', 'Lorenzo Millmore', '300 Fair Oaks Pass', 'Póvoa de Penela', '3630-354', 'Portugal');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (13, 'Gabvine', 'Sherlocke Poff', '3034 Schmedeman Avenue', 'Ouahigouya', null, 'Burkina Faso');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (14, 'Kwinu', 'Holmes Binnell', '66 Valley Edge Road', 'Yanwo', null, 'China');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (15, 'Oozz', 'Freda McGraffin', '10 Mendota Hill', 'Watthana Nakhon', '34230', 'Thailand');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (16, 'Skinte', 'Cullan Sansbury', '1376 Novick Trail', 'Taungdwingyi', null, 'Myanmar');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (17, 'Dabvine', 'Adelind MacFarlane', '20047 Anthes Parkway', 'Waigete', null, 'Indonesia');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (18, 'Dynabox', 'Rodger Cropton', '4229 Loomis Circle', 'Songmuping', null, 'China');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (19, 'Skilith', 'Lucia Stower', '2893 Old Gate Alley', 'London', 'EC3M', 'United Kingdom');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (20, 'Wordtune', 'Eli Wessell', '78 Veith Road', 'Dayton', '45432', 'United States');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (21, 'Topicware', 'Morgen Marham', '9 Sutteridge Hill', 'Drammen', '3037', 'Norway');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (22, 'Feedspan', 'Natka Ropars', '7554 Little Fleur Drive', 'Paris 07', '75326 CEDEX 07', 'France');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (23, 'Meezzy', 'Rona Arnowitz', '43032 Claremont Avenue', 'Taipingxi', null, 'China');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (24, 'Dynabox', 'Fredia Fullman', '55072 Cordelia Street', 'Gueset', '2436', 'Philippines');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (25, 'Innojam', 'Nissy Gorries', '4370 Nelson Road', 'Karangpari', null, 'Indonesia');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (26, 'Linkbridge', 'Averil McAw', '38 Kenwood Point', 'Xihuachi', null, 'China');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (27, 'Fanoodle', 'Siegfried Gages', '2188 Russell Way', 'Sungai Iyu', null, 'Indonesia');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (28, 'Skiptube', 'Sukey Stoop', '59511 Dapin Crossing', 'Mafang', null, 'China');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (29, 'Thoughtbridge', 'Wilona Sans', '364 Westerfield Street', 'Reims', '51679 CEDEX 2', 'France');
insert into Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) values (30, 'Kamba', 'Kelsey Paddie', '1 Debs Point', 'São Torcato', '4800-349', 'Portugal');

-- Employees
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (1, 'Bleakley', 'Ivy', '1967-12-10', 'http://dummyimage.com/206x100.png/ff4444/ffffff', 'In sagittis dui vel nisl. Duis ac nibh.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (2, 'Hopfner', 'Silvana', '1999-12-09', 'http://dummyimage.com/236x100.png/cc0000/ffffff', 'Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem. Integer tincidunt ante vel ipsum.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (3, 'Cooley', 'Farris', '1975-07-16', 'http://dummyimage.com/128x100.png/ff4444/ffffff', 'Etiam vel augue. Vestibulum rutrum rutrum neque.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (4, 'Kenninghan', 'Aland', '1976-07-15', 'http://dummyimage.com/172x100.png/ff4444/ffffff', 'Aliquam non mauris.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (5, 'Feldhammer', 'Tildi', '1984-09-24', 'http://dummyimage.com/120x100.png/5fa2dd/ffffff', 'Vestibulum quam sapien, varius ut, blandit non, interdum in, ante.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (6, 'Coogan', 'Fiorenze', '1966-05-15', 'http://dummyimage.com/155x100.png/5fa2dd/ffffff', 'Nullam sit amet turpis elementum ligula vehicula consequat.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (7, 'Roobottom', 'Leeland', '1975-09-06', 'http://dummyimage.com/233x100.png/ff4444/ffffff', 'Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (8, 'Carah', 'Junie', '1973-03-04', 'http://dummyimage.com/191x100.png/cc0000/ffffff', 'In eleifend quam a odio.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (9, 'Coale', 'Munroe', '2003-04-15', 'http://dummyimage.com/194x100.png/5fa2dd/ffffff', 'Maecenas pulvinar lobortis est.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (10, 'Athowe', 'Nefen', '2002-05-13', 'http://dummyimage.com/162x100.png/5fa2dd/ffffff', 'Duis at velit eu est congue elementum.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (11, 'Ottewill', 'Paddy', '1969-02-23', 'http://dummyimage.com/217x100.png/5fa2dd/ffffff', 'Curabitur at ipsum ac tellus semper interdum. Mauris ullamcorper purus sit amet nulla.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (12, 'O''Dowgaine', 'Gae', '1996-06-21', 'http://dummyimage.com/134x100.png/5fa2dd/ffffff', 'In congue. Etiam justo.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (13, 'Bonar', 'Pierette', '1967-02-12', 'http://dummyimage.com/134x100.png/cc0000/ffffff', 'Suspendisse potenti.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (14, 'Ellis', 'Nonna', '1984-04-15', 'http://dummyimage.com/164x100.png/ff4444/ffffff', 'Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam. Suspendisse potenti.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (15, 'Waker', 'Carleton', '1998-06-14', 'http://dummyimage.com/196x100.png/ff4444/ffffff', 'Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (16, 'Lilliman', 'Maighdiln', '1995-09-07', 'http://dummyimage.com/221x100.png/5fa2dd/ffffff', 'Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (17, 'Pickvance', 'Jayme', '1993-03-08', 'http://dummyimage.com/229x100.png/cc0000/ffffff', 'Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel sem.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (18, 'Colbourn', 'Mallorie', '1966-07-07', 'http://dummyimage.com/220x100.png/dddddd/000000', 'Aenean fermentum.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (19, 'Rozsa', 'Mischa', '1965-04-15', 'http://dummyimage.com/119x100.png/cc0000/ffffff', 'Integer tincidunt ante vel ipsum.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (20, 'Stirrip', 'Domenic', '1986-02-10', 'http://dummyimage.com/165x100.png/cc0000/ffffff', 'Sed sagittis.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (21, 'Glidder', 'Nixie', '1982-02-13', 'http://dummyimage.com/225x100.png/ff4444/ffffff', 'Cras in purus eu magna vulputate luctus.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (22, 'Pidgen', 'Clotilda', '1985-05-26', 'http://dummyimage.com/246x100.png/dddddd/000000', 'In est risus, auctor sed, tristique in, tempus sit amet, sem. Fusce consequat.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (23, 'Wolfenden', 'Upton', '1987-09-14', 'http://dummyimage.com/151x100.png/ff4444/ffffff', 'Proin leo odio, porttitor id, consequat in, consequat ut, nulla.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (24, 'Lindmark', 'Edvard', '1984-12-21', 'http://dummyimage.com/180x100.png/5fa2dd/ffffff', 'Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (25, 'Semble', 'Vitoria', '1975-03-01', 'http://dummyimage.com/217x100.png/5fa2dd/ffffff', 'Nulla facilisi. Cras non velit nec nisi vulputate nonummy.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (26, 'Nickels', 'Ashien', '1987-10-03', 'http://dummyimage.com/234x100.png/cc0000/ffffff', 'Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec pharetra, magna vestibulum aliquet ultrices, erat tortor sollicitudin mi, sit amet lobortis sapien sapien non mi.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (27, 'Garman', 'Chancey', '1985-11-17', 'http://dummyimage.com/122x100.png/dddddd/000000', 'Etiam justo.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (28, 'McLafferty', 'Crista', '1991-07-15', 'http://dummyimage.com/151x100.png/dddddd/000000', 'Proin at turpis a pede posuere nonummy.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (29, 'Butterly', 'Porty', '1987-03-06', 'http://dummyimage.com/246x100.png/5fa2dd/ffffff', 'Nulla nisl. Nunc nisl.');
insert into Employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes) values (30, 'Ricciardi', 'Nicoline', '1975-05-30', 'http://dummyimage.com/203x100.png/dddddd/000000', 'Suspendisse potenti. Cras in purus eu magna vulputate luctus.');

-- Categories
insert into Categories (CategoryID, CategoryName, Description) values (1, 'Food - Meats', 'Frozen sausage patties made with herbs and spices, perfect for breakfast sandwiches.');
insert into Categories (CategoryID, CategoryName, Description) values (2, 'Food - Snacks', 'Healthy chia pudding made with mango and coconut milk.');
insert into Categories (CategoryID, CategoryName, Description) values (3, 'Pets', 'Collapsible travel bowl for pets on the go.');
insert into Categories (CategoryID, CategoryName, Description) values (4, 'Pets', 'Gentle glove for brushing and massaging your pet.');
insert into Categories (CategoryID, CategoryName, Description) values (5, 'Garden', 'Convertible kneeler and seat for gardening comfort.');
insert into Categories (CategoryID, CategoryName, Description) values (6, 'Food - Sauces', 'Fresh basil pesto, perfect for pasta or as a sandwich spread.');
insert into Categories (CategoryID, CategoryName, Description) values (7, 'Kitchen', 'Quick-boiling kettle for home and office use.');
insert into Categories (CategoryID, CategoryName, Description) values (8, 'Food - Beverages', 'A refreshing drink mix that combines sweet raspberries and tart lemons, perfect for summer.');
insert into Categories (CategoryID, CategoryName, Description) values (9, 'Food - Snacks', 'Colorful veggie chips made from beets, carrots, and sweet potatoes.');
insert into Categories (CategoryID, CategoryName, Description) values (10, 'Food - Salads', 'Fresh kale with Caesar dressing and croutons.');
insert into Categories (CategoryID, CategoryName, Description) values (11, 'Clothing - Footwear', 'Comfortable slide sandals for lounging by the pool.');
insert into Categories (CategoryID, CategoryName, Description) values (12, 'Food - Dairy', 'Creamy yogurt made with maple and almond flavors.');
insert into Categories (CategoryID, CategoryName, Description) values (13, 'Food - Baked Goods', 'A delicious tart filled with fresh raspberry filling.');
insert into Categories (CategoryID, CategoryName, Description) values (14, 'Food - Meat Alternatives', 'Firm tofu, a great plant-based protein option.');
insert into Categories (CategoryID, CategoryName, Description) values (15, 'Clothing - Tops', 'A comfortable sweatshirt featuring a bold graphic print.');
insert into Categories (CategoryID, CategoryName, Description) values (16, 'Food - Frozen Meals', 'Prepped vegetables and sauces for a quick Asian stir-fry meal.');
insert into Categories (CategoryID, CategoryName, Description) values (17, 'Food - Cereal', 'Classic cereal made with whole grains and honey.');
insert into Categories (CategoryID, CategoryName, Description) values (18, 'Fitness', 'Insulated water bottle for keeping drinks cold.');
insert into Categories (CategoryID, CategoryName, Description) values (19, 'Food - Snacks', 'Delicious pretzel bites with a sweet honey mustard flavor, perfect for dipping.');
insert into Categories (CategoryID, CategoryName, Description) values (20, 'Electronics', 'Ergonomic wireless mouse with adjustable DPI.');
insert into Categories (CategoryID, CategoryName, Description) values (21, 'Food - Dried Fruits', 'Sweet, chewy dried apricots, great for snacking or baking.');
insert into Categories (CategoryID, CategoryName, Description) values (22, 'Toys', 'Complete kit with crayons, markers, and paper for young artists.');
insert into Categories (CategoryID, CategoryName, Description) values (23, 'Food - Salads', 'A zesty salad with black beans, corn, and chipotle dressing.');
insert into Categories (CategoryID, CategoryName, Description) values (24, 'Food - Snacks', 'Sweet and salty kettle corn, perfect for snacking.');
insert into Categories (CategoryID, CategoryName, Description) values (25, 'Food - Bread', 'Soft and fluffy whole wheat pita bread, great for wraps.');
insert into Categories (CategoryID, CategoryName, Description) values (26, 'Food - Beverages', 'A soothing tea blend with turmeric and ginger for wellness.');
insert into Categories (CategoryID, CategoryName, Description) values (27, 'Travel', 'Digital scale to avoid overweight baggage fees.');
insert into Categories (CategoryID, CategoryName, Description) values (28, 'Accessories', 'RFID-blocking slim wallet for cards and cash.');
insert into Categories (CategoryID, CategoryName, Description) values (29, 'Kitchen', 'Bartender kit with shaker, jigger, and strainer.');
insert into Categories (CategoryID, CategoryName, Description) values (30, 'Food - Frozen Food', 'A nourishing bowl of sweet potatoes and chickpeas with spices.');

-- Suppliers
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (1, 'Buzzdog', 'Quinn Romeuf', '02 Homewood Alley', 'Puerto La Cruz', null, 'Venezuela', '541-871-9589');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (2, 'Zoombeat', 'Blaine Ceccoli', '99729 Mayer Point', 'Talā', null, 'Egypt', '821-650-5414');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (3, 'Gigashots', 'Cherry Janic', '18 Brentwood Crossing', 'Vale de Figueira', '2000-715', 'Portugal', '541-636-3276');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (4, 'Jaxnation', 'Gwyneth Strognell', '6 Longview Plaza', 'Banyue', null, 'China', '167-518-6481');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (5, 'Zoomcast', 'Kerrill Muat', '45 Graceland Alley', 'Grzmiąca', '78-450', 'Poland', '782-771-9131');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (6, 'Tavu', 'Corrina Guillet', '7 Grim Parkway', 'Villa Mercedes', '5461', 'Argentina', '115-311-5932');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (7, 'Brightdog', 'Isaak Vearnals', '7 Sutteridge Junction', 'Krasnyy Oktyabr’', '398526', 'Russia', '565-789-7729');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (8, 'Skiba', 'Joan Riteley', '64 Manitowish Point', 'Al Qarārah', null, 'Palestinian Territory', '531-344-5279');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (9, 'Brainverse', 'Dot Forgan', '5709 Dakota Point', 'Punta Gorda', '33982', 'United States', '941-848-2593');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (10, 'Ntag', 'Egor Bleasdale', '19131 Portage Terrace', 'Klagen', null, 'Indonesia', '841-134-7892');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (11, 'Zoomlounge', 'Domeniga Collopy', '25408 Londonderry Park', 'Langchuan', null, 'China', '396-565-9381');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (12, 'Rooxo', 'Ivett Becken', '7212 Swallow Circle', 'Zarechnyy', '164020', 'Russia', '577-103-9229');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (13, 'Realblab', 'Lisha Rishworth', '940 Orin Pass', 'Bernardo Larroudé', '6220', 'Argentina', '657-364-4825');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (14, 'Innojam', 'Flo Burgne', '50 Bluejay Plaza', 'Warin Chamrap', '76110', 'Thailand', '711-318-4866');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (15, 'Kazio', 'Cristy Poizer', '6 Columbus Plaza', 'Poxin', null, 'China', '386-311-8406');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (16, 'Yodo', 'Shanta Redmire', '70 Bobwhite Way', 'Cedynia', '74-520', 'Poland', '953-682-0674');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (17, 'Livepath', 'Guillemette Stopford', '2 Waubesa Hill', 'Makbon', null, 'Indonesia', '627-556-7111');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (18, 'Skidoo', 'Madalena Raffan', '2770 Butterfield Park', 'Engel’s', '413146', 'Russia', '640-941-2375');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (19, 'Quatz', 'Artie Deal', '75 Dahle Way', 'Sechelt', 'K1B', 'Canada', '615-531-4940');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (20, 'Vinder', 'Joceline Edmonds', '46 Brickson Park Avenue', 'Battambang', null, 'Cambodia', '318-329-5652');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (21, 'Avaveo', 'Karlens Hebburn', '1 Northwestern Junction', 'Guoyuan', null, 'China', '326-525-6921');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (22, 'Topdrive', 'Benito Feragh', '6844 Prairie Rose Terrace', 'Villa Nueva', '5903', 'Argentina', '534-813-3846');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (23, 'Lazzy', 'Emilee Maccaddie', '736 Ruskin Hill', 'Las Matas de Farfán', '11809', 'Dominican Republic', '976-796-2845');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (24, 'Oyonder', 'Nicola Battisson', '63 Pleasure Plaza', 'Catumbela', null, 'Angola', '469-758-3135');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (25, 'Aivee', 'Brenn Gronw', '91613 Macpherson Point', 'Duishan', null, 'China', '535-738-6203');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (26, 'Buzzdog', 'Enrika Skrine', '04 Transport Circle', 'Tajimi', '507-0901', 'Japan', '454-861-4208');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (27, 'Vitz', 'Willis Foss', '1 Lake View Court', 'Mvomero', null, 'Tanzania', '495-818-3022');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (28, 'Wordtune', 'Lesly Martinuzzi', '6 Canary Crossing', 'Xicheng', null, 'China', '853-689-5207');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (29, 'Zoombox', 'Cally Harker', '47039 Jana Drive', 'Xinjian', null, 'China', '876-989-2634');
insert into Suppliers (SupplierID, SupplierName, ContactName, Address, City, PostalCode, Country, Phone) values (30, 'Centidel', 'Carter Lamberts', '604 Kensington Parkway', 'Bardaï', null, 'Chad', '604-626-2215');

-- Products
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (1, 'Sweet and Spicy Barbecue Sauce', 18, 7, '12 - 1 lb pkgs.', 12.51);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (2, 'Hummus Variety Pack', 13, 24, '24 - 12 oz bottles', 42.26);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (3, 'White Rice', 25, 13, '48 - 6 oz jars', 8.96);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (4, 'Insulated Coffee Mug', 14, 6, '5 kg pkg.', 14.58);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (5, 'Spaghetti Sauce', 5, 2, '24 - 12 oz bottles', 18.53);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (6, 'Luminous Night Light', 28, 4, '48 - 6 oz jars', 34.63);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (7, 'Buffalo Sauce', 1, 1, '10 - 500 g pkgs.', 15.95);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (8, 'Honey Graham Crackers', 9, 1, '1 kg pkg.', 44.39);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (9, 'Smart Thermostat with Wi-Fi', 25, 25, '12 - 550 ml bottles', 19.41);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (10, 'Zucchini Noodle Pasta', 8, 19, '5 kg pkg.', 45.41);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (11, 'Protein Pancake Mix', 13, 7, '12 - 8 oz jars', 20.3);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (12, 'Sweet Potatoes (organic)', 17, 3, '24 - 250 g pkgs.', 9.63);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (13, 'Brussels Sprouts', 16, 18, '1 kg pkg.', 27.95);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (14, 'Frozen Acai Bowl', 23, 23, '12 - 550 ml bottles', 48.36);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (15, 'Noise-Canceling Earbuds', 23, 1, '48 - 6 oz jars', 16.11);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (16, 'Caramelized Onion Dip', 30, 20, '12 - 550 ml bottles', 21.81);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (17, 'Foam Roller for Muscle Recovery', 16, 24, '10 - 500 g pkgs.', 41.39);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (18, 'Mayonnaise', 30, 3, '12 - 550 ml bottles', 29.22);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (19, 'Sweet Pea Hummus', 8, 25, '10 - 500 g pkgs.', 37.45);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (20, 'Fire Roasted Salsa', 4, 19, '10 - 500 g pkgs.', 49.97);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (21, 'Rechargeable Battery Organizer', 29, 16, '12 - 1 lb pkgs.', 31.88);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (22, 'Italian Sausage and Peppers', 27, 29, '12 - 8 oz jars', 10.64);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (23, 'Almond Milk', 20, 1, '24 - 12 oz bottles', 38.82);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (24, 'Marinara Sauce', 25, 25, '10 - 500 g pkgs.', 13.98);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (25, 'Home Karaoke System', 5, 19, '24 - 250 g pkgs.', 19.06);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (26, 'Whipped Cream Cheese', 13, 30, '10 boxes x 20 bags', 10.66);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (27, 'Spaghetti Sauce', 7, 16, '10 - 500 g pkgs.', 19.39);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (28, 'Mediterranean Couscous', 9, 29, '5 kg pkg.', 7.52);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (29, 'Ginger Turmeric Latte Mix', 21, 4, '24 - 250 g pkgs.', 16.85);
insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values (30, 'Honey Graham Crackers', 5, 5, '5 kg pkg.', 45.12);

-- Orders
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (1, 5, 21, '2026-11-17', 20);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (2, 4, 3, '2026-10-27', 30);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (3, 28, 3, '2026-08-13', 3);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (4, 3, 14, '2026-06-07', 10);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (5, 12, 23, '2026-02-11', 16);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (6, 14, 15, '2025-01-17', 15);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (7, 25, 21, '2026-06-16', 20);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (8, 15, 20, '2026-03-22', 27);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (9, 21, 14, '2025-10-01', 7);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (10, 8, 6, '2026-10-24', 14);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (11, 11, 28, '2026-03-03', 14);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (12, 25, 23, '2025-05-24', 10);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (13, 15, 28, '2026-01-08', 2);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (14, 8, 3, '2025-11-28', 30);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (15, 18, 16, '2025-06-22', 11);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (16, 1, 7, '2026-10-25', 7);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (17, 16, 21, '2026-09-01', 20);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (18, 26, 1, '2025-02-04', 7);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (19, 18, 7, '2025-11-21', 16);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (20, 17, 12, '2025-09-02', 25);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (21, 6, 27, '2026-10-20', 8);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (22, 18, 16, '2025-11-28', 9);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (23, 19, 10, '2025-09-29', 22);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (24, 16, 4, '2026-10-20', 7);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (25, 22, 23, '2025-03-21', 28);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (26, 24, 23, '2025-02-11', 26);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (27, 6, 4, '2026-05-22', 3);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (28, 15, 7, '2026-03-24', 28);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (29, 18, 24, '2026-04-13', 16);
insert into Orders (OrderID, CustomerID, EmployeeID, OrderDate, ShipperID) values (30, 5, 1, '2026-08-24', 29);

-- OrderDetails
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (1, 28, 4, 9);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (2, 9, 28, 42);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (3, 15, 3, 44);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (4, 4, 4, 36);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (5, 8, 16, 6);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (6, 20, 4, 6);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (7, 20, 17, 37);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (8, 18, 27, 26);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (9, 18, 26, 29);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (10, 27, 1, 8);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (11, 27, 26, 42);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (12, 15, 2, 15);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (13, 18, 16, 7);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (14, 11, 15, 37);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (15, 3, 30, 31);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (16, 9, 7, 8);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (17, 17, 18, 13);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (18, 10, 6, 22);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (19, 24, 18, 37);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (20, 20, 22, 38);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (21, 25, 23, 6);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (22, 16, 7, 7);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (23, 10, 5, 42);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (24, 22, 12, 20);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (25, 7, 6, 42);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (26, 30, 14, 16);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (27, 26, 23, 16);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (28, 7, 15, 13);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (29, 28, 30, 32);
insert into OrderDetails (OrderDetailID, OrderID, ProductID, Quantity) values (30, 9, 22, 40);
