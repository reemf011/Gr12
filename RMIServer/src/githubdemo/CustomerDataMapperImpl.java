/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubdemo;

/**
 *
 * @author reemf011
 */
//public class CustomerDataMapperImpl {
//      @Override
//        public Optional<Customer> find(int UserID) {
//            return this.getCustomer().stream().filter(x -> x.getId() == custId).findFirst();
//        }
//
//        @Override
//        public void update(Customer CustomerToBeUpdated) throws DataMapperException {
//            String Fname = CustomerToBeUpdated.getFname();
//            Integer index = Optional.of(CustomerToBeUpdated)
//                    .map(Customer::getId())
//                    .flatMap(this::find)
//                    .map(Customers::indexOf)
//                    .orElseThrow(() -> new DataMapperException("Customer [" + Fname + "] is not found"));
//            Customers.set(index, CustomerToBeUpdated);
//        }
//
//        @Override
//        public void insert(Customer studentToBeInserted) throws DataMapperException {
//            Optional<Customer> cust= find(studentToBeInserted.getId());
//            if (cust.isPresent()) {
//                String Fname = studentToBeInserted.getFname();
//                throw new DataMapperException("Student already [" + Fname + "] exists");
//            }
//
//            Customers.add(studentToBeInserted);
//        }
//
//        @Override
//        public void delete(Customer studentToBeDeleted) throws DataMapperException {
//            if (!Customers.remove(studentToBeDeleted)) {
//                String Fname = studentToBeDeleted.getFname();
//                throw new DataMapperException("Student [" + Fname + "] is not found");
//            }
//        }
//
//        public List<Customer> getStudents() {
//            return this.Customers;
//        }
   // }

