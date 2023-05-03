# Phone-Book-Managment

# Description:

It’s required to implement typical phone book management application which encompasses searching, inserting and deleting operations. It’s required to implement this application using the following  types  of  binary  search  trees:  AVL  trees,  2-4  trees  and  heap. The initial contact list is provided to you as a csv file. The file will include 100 contacts. Each one is located in one line and has the following data: name (first name, last name), phone, email and address. The program accepts this file and insert the contacts to the selected data structure. You will enable user to select between AVL tree, 2-4 tree or heap.


# Requirements:

1-   You will using first name and last name to order your phone book.
2-   Give the user options to search, add or delete a contact;  searching will be by first name, last name, both of them or part of them.
3-   Find a way to show the structure of your built BST to the user, no need of GUI; you may use test mode to show this.
Hint: starting from any node draw 2 levels of the tree, give me an option to start from the root.
4-   Apply inorder traversal to get all contacts.
5-   Get some information about your tree such as:
6-   Number of nodes
7-   Height of the tree
8-   Compute the runtime of each operation and print it after each one.

# Expectation:

The application show start by a menu that gives the user these options:

1-   Upload a contact file (.csv); name (first name, last name), phone, email and address
2-   AVL tree (You have to upload a contact file firstly)
3-   2-4 tree (You have to upload a contact file firstly)
4-   Heap (You have to upload a contact file firstly)

When user select 2,3,4 you will build the selected tree and give the user following options: Add, Delete, Search, Back to main menu. Search option will accept string form the user before perform the search process. Your application may be tested using 10000 contacts.

