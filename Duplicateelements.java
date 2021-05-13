class Node:  
    def __init__(self,data):  
        self.data = data;  
        self.next = None;  
          
class RemoveDuplicate:  
      
    def __init__(self):  
        self.head = None;  
        self.tail = None;  
          
      
    def addNode(self, data):  
         
        newNode = Node(data);  
          
         
        if(self.head == None):  
              
            self.head = newNode;  
            self.tail = newNode;  
        else:  
              
            self.tail.next = newNode;  
              
            self.tail = newNode;  
              
      
    def removeDuplicate(self):  
          
        current = self.head;  
        index = None;  
        temp = None;  
          
        if(self.head == None):  
            return;  
        else:  
            while(current != None):  
                  
                temp = current;  
                  
                index = current.next;  
                  
                while(index != None):  
                     
                    if(current.data == index.data):  
                          
                         
                        temp.next = index.next;  
                    else:  
                          
                        temp = index;  
                    index = index.next;  
                current = current.next;  
                  
      
    def display(self):  
          
        current = self.head;  
        if(self.head == None):  
            print("List is empty");  
            return;  
        while(current != None):  
             
            print(current.data);  
            current = current.next;  
          
   
sList = RemoveDuplicate();  
          
  
sList.addNode(1);  
sList.addNode(2);  
sList.addNode(3);  
sList.addNode(2);  
sList.addNode(2);  
sList.addNode(4);  
sList.addNode(1);  
   
print("Originals list: ");  
sList.display();  
   
  
sList.removeDuplicate();  
   
print("List after removing duplicates: ");  
sList.display();  
