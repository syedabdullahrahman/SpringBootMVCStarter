package sbs.repository.x3;
import java.util.Date;
// http://www.codesenior.com/en/tutorial/Spring-Generic-DAO-and-Generic-Service-Implementation
import java.util.List;
import java.util.Map;

import sbs.controller.dirrcpship.DirectReceptionsShipmentLine;
import sbs.model.proprog.Project;
import sbs.model.wpslook.WpslookRow;
import sbs.model.x3.X3BomItem;
import sbs.model.x3.X3Client;
import sbs.model.x3.X3ConsumptionProductInfo;
import sbs.model.x3.X3ConsumptionSupplyInfo;
import sbs.model.x3.X3Product;
import sbs.model.x3.X3ProductFinalMachine;
import sbs.model.x3.X3ProductSellDemand;
import sbs.model.x3.X3ProductionOrderDetails;
import sbs.model.x3.X3PurchaseOrder;
import sbs.model.x3.X3SalesOrder;
import sbs.model.x3.X3SalesOrderLine;
import sbs.model.x3.X3ShipmentMovement;
import sbs.model.x3.X3ShipmentStockLineWithPrice;
import sbs.model.x3.X3UtrFault;
import sbs.model.x3.X3UtrFaultLine;
import sbs.model.x3.X3UtrMachine;
import sbs.model.x3.X3UtrWorker;
import sbs.model.x3.X3WarehouseWeightDetailLine;
import sbs.model.x3.X3WarehouseWeightLine;
import sbs.model.x3.X3Workstation;

public interface JdbcOracleX3Repository  {
	
    public List<String> findAllUsers(String company);
    public List<X3Product> findAllActiveProducts(String company);
	public X3Product findProductByCode(String company, String code);
    public String findItemDescription(String company, String code);
	public List<X3Client> findAllClients(String company);
	public X3Client findClientByCode(String company, String code);
	public List<X3SalesOrder> findAllSalesOrders(String company);
	public List<X3SalesOrder> findOpenedSalesOrders(String company);
	public X3SalesOrder findSalesOrderByNumber(String company, String number);
	public X3PurchaseOrder findPurchaseOrderByNumber(String company, String number);
	public X3ProductionOrderDetails getProductionOrderInfoByNumber(String company, String number);
	public List<X3BomItem> findBomPartsByParent(String company, String productCode);
	public List<WpslookRow> findLocationsOfProduct(String company, String code);
	public List<X3BomItem> findProductionPartsByProductionOrderAndOperation(String company, String productionOrder, int operationNumber);
	public String findOperationDescriptionByProductionOrder(String company, String productionOrder, int operationNumber);
	public String findFinalClientByOrder(String company, String order);
	public Map<String, X3UtrMachine> findAllUtrMachines(String company);
	public Map<String, X3UtrWorker> findAllUtrWorkers(String company);
	public List<X3ShipmentMovement> findAdrShipmentMovementsInPeriod(Date startDate, Date endDate);
	public Map<String, X3UtrFault> findUtrFaultsInPeriod(Date startDate, Date endDate);
	public Map<String, X3UtrFault> findAllUtrFaults();
	public List<X3UtrFaultLine> findUtrFaultLinesAfterDate(Date startDate);
	public List<X3UtrFaultLine> findAllUtrFaultLines();
	public Map<String, X3ProductFinalMachine> findX3ProductFinalMachines(String company);
	public List<Project> findPendingProjectsProgress();
	public Project findProjectProgressByNumber(String number);
	public List<X3WarehouseWeightLine> findWeightSumLine(Date startDate, Date endDate, int weightQueryType);
	public List<X3WarehouseWeightDetailLine> findWeightDetailLine(Date startDate, Date endDate, int weightQueryType);
	public Map<String, Integer> findAcvAverageUsageInPeriod(String startPeriod, String endPeriod, String company);
	public Map<String, X3ProductSellDemand> findAcvProductSellDemand(Date startDate, Date endDate, String company);
	public List<String> findAcvNonProductionCodes(String company);
	public Map<String, Integer> findAcvMagStock(String company);
	public Map<String, Integer> findAcvShipStock(String company);
	public List<X3ShipmentStockLineWithPrice> findAllShipStockWithAveragePrice(String company);
	public List<DirectReceptionsShipmentLine> findDirectReceptionsShipmentLines(Date startDate, Date endDate, String company);
	public Map<String, Integer> getAcvConsumptionListForYear(int year, String company);
	public Map<String, Integer> getAcvDemandList(String company);
	public Map<String, X3ConsumptionSupplyInfo> getAcvListOfLastSupplyInfo(String company);
	public List<X3ConsumptionProductInfo> getAcvListForConsumptionReport(String company);
	public Map<String, String> getAcvProductsEnglishDescriptions(String company);
	public Map<String, Integer> findGeneralStockForAllProducts(String company);
	public List<X3SalesOrderLine> findOpenedSalesOrderLinesInPeriod(Date startDate, Date endDate, String company);
	public X3Workstation findWorkstationByCode(String company, String code);
	public boolean checkIfLocationExist(String company, String location);
	
	
}
