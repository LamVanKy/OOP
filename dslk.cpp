#include <stdio.h>
Note *TaoNode (){
    Node *A;
    int x;
    scanf("%d",&x);
    A->data = x;
}
void XoaX(list l,note X){
    int test=0;
    Node *p=l.head;
    while(p!=NULL){
        if(X->data>p->data){
            X->next=p->next;
            break;
        }
        p=p->next;
    }
    if(t==0){
        node *last=head;
        while (last->next != NULL) {
        last = last->next;
    }
    last->next=X;
    X->next=l.tail;
    }
}