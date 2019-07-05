# RecycleView
Sample project explaining how a recycler view works in Android

# activity_main.xml
It contains only the recycler component which has to hold the number of elements in a list view.

# item_row.xml 
It contains the element which has to be recycled and used.It contains the text field and other Ui components as a sinle entity.
On implementation this whole component will get recycled and will be set as a list of elements in the main xml.

# MainActivity.java
Loads the main content xml.
Set the relative layout
Set the UI component of item_row.xml(recycler list items) to the recycler view in the main xml.
Call the adapter class to populate the data for the UI elements in the view.

# CustomAdapter.java
The custom adapter inflates the row view and constructs the MyViewHolder object .
onCreate:
which is the smaller entity Ui component that will be recycle multiple times to form the list view.
The MyViewHolder obj contains the ui textfield and other components .It is nothing but the java obj 
equivalent to the ui component in item_row.xml.

onBind:
With the help of position the MyViewHolder object will be set for n times where n is the number of elemnts in the collection.
(i.e) teams in this case.
'n' is returned from getItemCount() method in the adapter.

